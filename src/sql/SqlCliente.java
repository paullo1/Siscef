
package sql;

import java.sql.*;
import javax.swing.JOptionPane;

public class SqlCliente extends Conexao implements Autenticar {
    private int idCliente;
    private int idEndereco;
    private String nome;
    private String dataNasc;
    private String cpf;
    private String tel;
    
     public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdEndereco(int idEndereco){
        this.idEndereco = idEndereco;
    }
    
    public int getIdEndereco(){
        return this.idEndereco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }
    
    public String getDataNasc(){
        return this.dataNasc;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    
    public String getTel(){
        return this.tel;
    }
    
  
    //metodos da interface autenticar
    public String gravar(int idEndereco, String nome, String dataNasc, String cpf, String tel){
        conectar();
        try{
            stmt = con.prepareStatement("INSERT INTO Cliente(idCliente, Endereco_idEndereco, nome, dataNasc, cpf) VALUES(0,?,?,?,?)");
            stmt.setInt(1, idEndereco);
            stmt.setString(2, nome);
            stmt.setString(3, dataNasc);
            stmt.setString(4, cpf);
            stmt.setString(5, tel);
            stmt.executeUpdate();
            stmt.executeQuery("COMMIT");
        }catch (Exception e) {
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String consultar(int id){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "SELECT * FROM Cliente WHERE idCliente="+id+"";
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                setIdEndereco(Integer.parseInt(String.valueOf(rs.getObject("Cliente.Endereco_idEndereco"))));
                setNome(String.valueOf(rs.getObject("Cliente.nome")));
                setDataNasc(String.valueOf(rs.getObject("Cliente.dataNasc")));
                setCpf(String.valueOf(rs.getObject("Cliente.cpf")));
                setTel(String.valueOf(rs.getObject("Cliente.tel")));
            }else{
                JOptionPane.showMessageDialog(null, "Id invalida!", "Atencao!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String excluir(int id){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "DELETE FROM Cliente WHERE idCliente="+id;
            stm.execute(sql);
            stm.executeQuery("COMMIT");
            stm = con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String editar(int id, String nome, String dataNasc, String cpf, String tel){
        conectar();
        try{
            stm = con.createStatement();
            String sql ="UPDATE Cliente SET nome ='"+nome+"', dataNasc ='"+dataNasc+"', cpf = '"+cpf+"', tel = '"+tel+"' WHERE idPessoa="+id;
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
            String sql = "SELECT idCliente FROM Cliente";
            rs = stm.executeQuery(sql);
            if (rs.last()){
                setIdCliente(Integer.parseInt(String.valueOf(rs.getObject("idCliente"))));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();    
        return getIdCliente();
        
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

    @Override
    public String editar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void gravar(int id, String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
