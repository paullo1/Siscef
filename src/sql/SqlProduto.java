//implementada 22/11/2020

package sql;

import java.sql.*;
import javax.swing.JOptionPane;
import static sql.Conexao.con;
import static sql.Conexao.conectar;
import static sql.Conexao.desconectar;
import static sql.Conexao.rs;
import static sql.Conexao.stm;
import static sql.Conexao.stmt;

public class SqlProduto extends Conexao implements Autenticar {
    
    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private String valorProduto;
    
     public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    
    public int getIdProduto(){
        return this.idProduto;
    }
    
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    
    public String getNomeProduto(){
        return this.nomeProduto;
    }
    
    public void setDescricaoProduto(String descricaoProduto){
        this.descricaoProduto = descricaoProduto;
    }
    
    public String getDescricaoProduto(){
        return this.descricaoProduto;
    }
    
    public void setValorProduto(String valorProduto){
        this.valorProduto = valorProduto;
    }
    public String getValorProduto(){
        return this.valorProduto;
    }
    
    public String gravar(int idProduto, String nomeProduto, String descricaoProduto, String valorProduto){
        conectar();
        try{
            stmt = con.prepareStatement("INSERT INTO Produto(idProduto, nome, descricao, valor) VALUES (0,?,?,?)");
            stmt.setInt(1, idProduto);
            stmt.setString(2, nomeProduto);
            stmt.setString(3, descricaoProduto);
            stmt.setString(4, valorProduto);
            stmt.executeUpdate();
            stmt.executeQuery("COMMIT");
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String consultar(int idProduto){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "SELECT * FROM Produto WHERE idProduto="+idProduto;
            rs = stm.executeQuery(sql);
            if (rs.next()){
                setIdProduto(Integer.parseInt(String.valueOf(rs.getObject("idProduto"))));
                setNomeProduto(String.valueOf(rs.getObject("nome")));
                setDescricaoProduto(String.valueOf(rs.getObject("descricao")));
                setValorProduto(String.valueOf(rs.getObject("valor")));
            }else{
                JOptionPane.showMessageDialog(null, "ID invalido!","Atencao!",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }

    public String excluir(int idProduto){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "DELETE FROM Produto WHERE idProduto ="+idProduto;
            stm.execute(sql);
            stm.executeQuery("COMMIT");
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String editar(int idProduto, String nomeProduto, String descricaoProduto, String valorProduto){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "UPDATE Produto SET nome = '"+nomeProduto+"', descricao = '"+descricaoProduto+"',valor = '"+valorProduto+"'  WHERE idProduto = "+idProduto;
            stm.executeUpdate(sql);
            stm.execute("COMMIT");
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public int consultarId(){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "SELECT idProduto FROM Produto";
            rs = stm.executeQuery(sql);
            if (rs.last()){
                setIdProduto(Integer.parseInt(String.valueOf(rs.getObject("idProduto"))));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();    
        return getIdProduto();  
      
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
