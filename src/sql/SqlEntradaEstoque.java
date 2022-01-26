
package sql;

import java.sql.*;
import javax.swing.JOptionPane;

public class SqlEntradaEstoque extends Conexao implements Autenticar {
    
    private int idCompra;
    private int idFornecedor;
    private int idProduto;
    private String dataEntEstoque;
    private String valorCompra;
    private int qtd;


     public void setIdCompra(int idCompra){
        this.idCompra = idCompra;
    }
    
    public int getIdCompra(){
        return this.idCompra;
    }
    
    public void setIdFornecedor(int idFornecedor){
        this.idFornecedor = idFornecedor;
    }
    
    public int getIdFornecedor(){
        return this.idFornecedor;
    }
    
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    
    public int getIdProduto(){
        return this.idProduto;
    }
    
    public void setDataEntEstoque(String dataEntEstoque){
        this.dataEntEstoque = dataEntEstoque;
    }
    
    public String getDataEntEstoque(){
        
        return this.dataEntEstoque;
    }
    public void setValorCompra(String valorCompra){
        this.valorCompra = valorCompra;
    }
    
    public String getValorCompra(){
        return this.valorCompra;
    }
    
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    
    public int getQtd(){
        return this.qtd;
    }
    
    public String gravar(int idFornecedor, int idProduto, String dataEntEstoque, String valorCompra, int qtd){
        conectar();
        try{
            stmt = con.prepareStatement("INSERT INTO Compra(idCompra, Fornecedor_idFornecedor, Produto_idProduto, dataentestoque, valorcompra) VALUES (0,?,?,?,?)");
            stmt.setInt(1, idFornecedor);
            stmt.setInt(2, idProduto);
            stmt.setString(3, dataEntEstoque);
            stmt.setString(4, valorCompra);
            stmt.setInt(5, qtd);
            stmt.executeUpdate();
            stmt.executeQuery("COMMIT");
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String consultar(int idCompra){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "SELECT * FROM Compra WHERE idCompra="+idCompra;
            rs = stm.executeQuery(sql);
            if (rs.next()){
                setIdFornecedor(Integer.parseInt(String.valueOf(rs.getObject("Fornecedor_idFornecedor"))));
                setIdProduto(Integer.parseInt(String.valueOf(rs.getObject("Produto_idProduto"))));
                setDataEntEstoque(String.valueOf(rs.getObject("dataentestoque")));
                setValorCompra(String.valueOf(rs.getObject("valorcompra")));
                setQtd(Integer.parseInt(String.valueOf(rs.getObject("qtd"))));
            }else{
                JOptionPane.showMessageDialog(null, "ID invalido!","Atencao!",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }

    public String excluir(int idFornecedor){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "DELETE FROM Compra WHERE idCompra ="+idCompra;
            stm.execute(sql);
            stm.executeQuery("COMMIT");
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String editar(int idCompra, int idFornecedor, int idProduto, String dataEntEstoque, String valorCompra, int qtd){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "UPDATE Compra SET dataentestoque = '"+dataEntEstoque+"', valorcompra = '"+valorCompra+"' WHERE idCompra = "+idCompra;
            stm.executeUpdate(sql);
            stm.execute("COMMIT");
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }

    @Override
    public String editar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String gravar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String consultar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
