
package sql;

import java.sql.*;
import javax.swing.JOptionPane;

public class SqlFornecedor extends Conexao implements Autenticar {
    
    private int idFornecedor;
    private String nome;
    private String cnpj;
    private String tel;
    private int idEndereco;
    
     public void setIdEndereco(int idEndereco){
        this.idEndereco = idEndereco;
    }
    
    public int getIdEndereco(){
        return this.idEndereco;
    }
    
    public void setIdFornecedor(int idFornecedor){
        this.idFornecedor = idFornecedor;
    }
    
    public int getIdFornecedor(){
        return this.idFornecedor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        
        return this.cnpj;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    
    public String getTel(){
        return this.tel;
    }
    
    public String gravar(int idEndereco, String nome, String cnpj, String tel){
        conectar();
        try{
            stmt = con.prepareStatement("INSERT INTO Fornecedor(idFornecedor, Endereco_idEndereco, nome, cnpj, tel) VALUES (0,?,?,?,?)");
            stmt.setInt(1, idEndereco);
            stmt.setString(2, nome);
            stmt.setString(3, cnpj);
            stmt.setString(4, tel);
            stmt.executeUpdate();
            stmt.executeQuery("COMMIT");
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String consultar(int idFornecedor){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "SELECT * FROM Fornecedor WHERE idFornecedor="+idFornecedor;
            rs = stm.executeQuery(sql);
            if (rs.next()){
                setIdEndereco(Integer.parseInt(String.valueOf(rs.getObject("Endereco_idEndereco"))));
                setNome(String.valueOf(rs.getObject("nome")));
                setCnpj(String.valueOf(rs.getObject("cnpj")));
                setTel(String.valueOf(rs.getObject("tel")));
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
            String sql = "DELETE FROM Fornecedor WHERE idFornecedor ="+idFornecedor;
            stm.execute(sql);
            stm.executeQuery("COMMIT");
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String editar(int idFornecedor, String nome, String cnpj, String tel){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "UPDATE Fornecedor SET nome = '"+nome+"', cnpj = '"+cnpj+"', tel = '"+tel+"' WHERE idFornecedor = "+idFornecedor;
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
            String sql = "SELECT idFornecedor FROM Fornecedor";
            rs = stm.executeQuery(sql);
            if (rs.last()){
                setIdFornecedor(Integer.parseInt(String.valueOf(rs.getObject("idFornecedor"))));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();    
        return getIdFornecedor();
        
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
