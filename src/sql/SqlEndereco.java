
package sql;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SqlEndereco extends Conexao implements Autenticar {
    
    private int idEndereco;
    private String cep;
    private String rua;
    private String num;
    private String bairro;
    private String cidade;
    private String estado;
    
    public void setIdEndereco(int idEndereco){
        this.idEndereco = idEndereco;
    }
    
    public int getIdEndereco(){
        return this.idEndereco;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public String getRua(){
        return this.rua;
    }
    public void setNum(String num){
        this.num = num;
    }
    
    public String getNum(){
        return this.num;
    }
    
    public void setBairro (String bairro){
        this.bairro = bairro;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setCidade (String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        
        return this.cidade;
    }
    
    public void setEstado (String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        
        return this.estado;
    }
    
    public String gravar(String cep, String rua, String num, String bairro, String cidade, String estado){
        conectar();
        try{
            stmt = con.prepareStatement("INSERT INTO Endereco(idEndereco, cep, rua, num, bairro, cidade, estado) VALUES (0,?,?,?,?,?,?)");
            stmt.setString(1, cep);
            stmt.setString(2, rua);
            stmt.setString(3, num);
            stmt.setString(4, bairro);
            stmt.setString(5, cidade);
            stmt.setString(6, estado);
            stmt.executeUpdate();
            stmt.executeQuery("COMMIT");
        }catch(Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String consultar(int idEndereco){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "SELECT * FROM Endereco WHERE idEndereco="+idEndereco;
            rs = stm.executeQuery(sql);
            if (rs.next()){
                setCep(String.valueOf(rs.getObject("cep")));
                setRua(String.valueOf(rs.getObject("rua")));
                setNum(String.valueOf(rs.getObject("num")));
                setBairro(String.valueOf(rs.getObject("bairro")));
                setCidade(String.valueOf(rs.getObject("cidade")));
                setEstado(String.valueOf(rs.getObject("estado")));
            }else{
                JOptionPane.showMessageDialog(null, "ID inválido!","Atenção!",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    /**
     *
     * @param idEndereco
     * @return
     */
    public String excluir(int idEndereco){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "DELETE FROM Endereco WHERE idEndereco ="+idEndereco;
            stm.execute(sql);
            stm.executeQuery("COMMIT");
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();
        return null;
    }
    
    public String editar(int id, String cep, String rua, String num, String bairro, String cidade, String estado){
        conectar();
        try{
            stm = con.createStatement();
            String sql = "UPDATE Endereco SET cep = '"+cep+"', rua = '"+rua+"', num = '"+num+"', bairro = '"+bairro+"', cidade = '"+cidade+"', estado = '"+estado+"' WHERE idEndereco = "+id;
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
            String sql = "SELECT idEndereco FROM Endereco";
            rs = stm.executeQuery(sql);
            if (rs.last()){
                setIdEndereco(Integer.parseInt(String.valueOf(rs.getObject("idEndereco"))));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        desconectar();    
        return getIdEndereco();
        

        
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

    

