
package sql;

import java.sql.*;
import javax.swing.JOptionPane;
import static sql.Conexao.con;
import static sql.Conexao.conectar;
import static sql.Conexao.desconectar;
import static sql.Conexao.rs;
import static sql.Conexao.stm;
import static sql.Conexao.stmt;

public class SqlSaidaEstoque extends Conexao implements Autenticar {
    
    private int idPedido;
    private int idCliente;
    private int idProduto;
    private String dataSaidaEstoque;
    private String valorPedido;
    private int qtd;

     public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }
    
    public int getIdPedido(){
        return this.idPedido;
    }
    
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public int getIdCliente(){
        return this.idCliente;
    }
    
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    
    public int getIdProduto(){
        return this.idProduto;
    }
    
    public void setDataSaidaEstoque(String dataSaidaEstoque){
        this.dataSaidaEstoque = dataSaidaEstoque;
    }
    
    public String getDataSaidaEstoque(){
        
        return this.dataSaidaEstoque;
    }
    public void setValorPedido(String valorPedido){
        this.valorPedido = valorPedido;
    }
    
    public String getValorPedido(){
        return this.valorPedido;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    
    public int getQtd(){
        return this.qtd;
    }
    
    public String gravar(int idCliente, int idProduto, String dataSaidaEstoque, String valorPedido, int qtd){
        conectar();
        try{
            stmt = con.prepareStatement("INSERT INTO Pedido(idPedido, Cliente_idCliente, Produto_idProduto, datasaidaestoque, valorpedido, qtd) VALUES (0,?,?,?,?,?)");
            stmt.setInt(1, idCliente);
            stmt.setInt(2, idProduto);
            stmt.setString(3, dataSaidaEstoque);
            stmt.setString(4, valorPedido);
            stmt.setInt(5, qtd);
            stmt.executeUpdate();
            stmt.executeQuery("COMMIT");
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String consultar(int idPedido){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "SELECT * FROM Pedido WHERE idPedido="+idPedido;
            rs = stm.executeQuery(sql);
            if (rs.next()){
                setIdCliente(Integer.parseInt(String.valueOf(rs.getObject("Cliente_idCliente"))));
                setIdProduto(Integer.parseInt(String.valueOf(rs.getObject("Produto_idProduto"))));
                setDataSaidaEstoque(String.valueOf(rs.getObject("datasaidaestoque")));
                setValorPedido(String.valueOf(rs.getObject("valorpedido")));
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
            String sql = "DELETE FROM Pedido WHERE idPedido ="+idPedido;
            stm.execute(sql);
            stm.executeQuery("COMMIT");
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String editar(int idPedido, int idCliente, int idProduto, String dataSaidaEstoque, String valorPedido, int qtd){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "UPDATE Pedido SET datasaidaestoque = '"+dataSaidaEstoque+"', valorpedido = '"+valorPedido+"', qtd = '"+qtd+"' WHERE idPedido = "+idPedido;
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
