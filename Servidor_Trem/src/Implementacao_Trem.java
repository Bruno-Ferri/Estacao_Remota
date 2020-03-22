/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Implementacao_Trem extends UnicastRemoteObject implements Interface_Trem{
    
    public Implementacao_Trem() throws RemoteException {
    }

    @Override
    public String Mostrainfo(int index) throws RemoteException {
        String estacao=null;
        switch (index){
            case 1:
                estacao="Brás";
                return estacao;
                
            case 2:
                estacao="MOOCA";
                break;
            case 3:
                estacao="IPIRANGA";
                break;
            case 4:
                estacao="TAMANDUATEÍ";
                break;
             case 5:
                estacao="SÃO CAETANO";
                break;
            case 6:
                estacao="UTINGA";
                break;  
            case 7:
                estacao="PREFEITO SALADINO";
                break;
            case 8:
                estacao="SANTO ANDRÉ";
                break;
            case 9:
                estacao="CAPUAVA";
                break;
            case 10:
                estacao="MAUÁ";
                break;
            case 11:
                estacao="GUAPITUBA";
                break;
            case 12:
                estacao="RIBEIRÃO PIRES";
                break;
            case 13:
                estacao="RIO GRANDE DA SERRA";
                break;

        }
        
       return estacao;
    }
    
    @Override
    public ArrayList Comodidades(int index){
        
        ArrayList comodidades = new ArrayList();
        switch (index){
            case 1:
                comodidades.add("Wi-fi\n");
                comodidades.add("Paraciclos\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Caixa de auto-atendimento\n");
                break;
                
            case 2:
                comodidades.add("Wi-fi\n");
                comodidades.add("Paraciclos\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                break;
                
            case 3:
                comodidades.add("Wi-fi\n");
                comodidades.add("Bibliotecário\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Área de leitura\n");
                comodidades.add("Caixa de auto-atendimento\n");
                break;
                
            case 4:
                comodidades.add("Wi-fi\n");
                comodidades.add("Bibliotecário\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Área de leitura\n");
                comodidades.add("Caixa de auto-atendimento\n");
                break;
                
            case 5:
                comodidades.add("Wi-fi\n");
                comodidades.add("Paraciclos\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Área de leitura\n");
                comodidades.add("Caixa de auto-atendimento\n");
                break;
                
             case 6:
                comodidades.add("Wi-fi\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Área de leitura\n");
                break;
                
            case 7:
                comodidades.add("Wi-fi\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Área de leitura\n");
                break;
                
            case 8:
                comodidades.add("Wi-fi\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Trocador\n");
                comodidades.add("Caixa de auto-atendimento\n");
                break; 
                
            case 9:
                comodidades.add("Wi-fi\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Paraciclos\n");
                comodidades.add("Caixa de auto-atendimento\n");
                break;
                
            case 10:
                comodidades.add("Wi-fi\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                break; 
                
            case 11:
                comodidades.add("Wi-fi\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Paraciclos\n");
                break;
                
            case 12:
                comodidades.add("Wi-fi\n");
                comodidades.add("Estacionamento de carro integrados\n");
                comodidades.add("Alimentação\n");
                break;
                
            case 13:
                comodidades.add("Wi-fi\n");
                comodidades.add("Alimentação\n");
                comodidades.add("Área de leitura\n");
                comodidades.add("Caixa de auto-atendimento\n");
                break; 
    }
    return comodidades;
}
    @Override
    public ArrayList Servicos(int index){
        ArrayList servicos = new ArrayList();
        
        switch (index){
            case 1:
                servicos.add("Balcão de informações\n");
                servicos.add("Elevador\n");
                servicos.add("Sanitários\n");
                servicos.add("Telefone de usuários\n");
                servicos.add("Achados e perdidos\n");
                servicos.add("Central de serviços - Atendimento pessoal\n");
                servicos.add("Conexões\n");
                break;
                
            case 2:
                servicos.add("Balcão de informações\n");
                servicos.add("Sanitários\n");
                servicos.add("Caixa de sugetões\n");
                servicos.add("Achados e perdidos\n");
                break;
                
            case 3:
                servicos.add("Balcão de informações\n");
                servicos.add("Elevador\n");
                servicos.add("Sanitários\n");
                servicos.add("Biblioteca\n");
                servicos.add("Achados e perdidos\n");
                servicos.add("Central de serviços - Atendimento pessoal\n");
                servicos.add("Conexões\n");
                break;               

            case 4:
                servicos.add("Balcão de informações\n");
                servicos.add("Elevador\n");
                servicos.add("Sanitários\n");
                servicos.add("Caixa de sugestões\n");
                servicos.add("Conexões\n");
                break;
                
            case 5:
                servicos.add("Balcão de informações\n");
                servicos.add("Sanitários\n");
                servicos.add("Biblioteca\n");
                servicos.add("Caixa de sugestões\n");
                break;
                
            case 6:
                servicos.add("Balcão de informações\n");
                servicos.add("Elevador\n");
                servicos.add("Sanitários\n");
                break;
                
            case 7:
                servicos.add("Balcão de informações\n");
                servicos.add("Sanitários\n");
                servicos.add("Biblioteca\n");
                servicos.add("Caixa de sugestões\n");
                break;
                
            case 8:
                servicos.add("Balcão de informações\n");
                servicos.add("Elevador\n");
                servicos.add("Sanitários\n");
                servicos.add("Achados e perdidos\n");
                servicos.add("Caixa de sugestões\n");
                servicos.add("Conexões\n");
                break;
                
            case 9:
                servicos.add("Balcão de informações\n");
                servicos.add("Sanitários\n");
                servicos.add("Telefone de usuários\n");
                servicos.add("Caixa de sugestões\n");
                break;
                
            case 10:
                servicos.add("Balcão de informações\n");
                servicos.add("Sanitários\n");
                servicos.add("Telefone de usuários\n");
                servicos.add("Achados e perdidos\n");
                servicos.add("Central de serviços - Atendimento pessoal\n");
                break;
                
            case 11:
                servicos.add("Balcão de informações\n");
                servicos.add("Elevador\n");
                servicos.add("Sanitários\n");
                servicos.add("Telefone de usuários\n");
                servicos.add("Caixa de sugestões\n");
                break;
                
            case 12:
                servicos.add("Balcão de informações\n");
                servicos.add("Elevador\n");
                servicos.add("Sanitários\n");
                servicos.add("Caixa de sugestões\n");
                break;
                
            case 13:
                servicos.add("Balcão de informações\n");
                servicos.add("Elevador\n");
                servicos.add("Sanitários\n");
                servicos.add("Telefone de usuários\n");;
                servicos.add("Central de serviços - Atendimento pessoal\n");
                servicos.add("Caixa de sugestões\n");
                servicos.add("Conexões\n");
                break;
        }
        return servicos;
    }
    
    @Override
    public String Mostratempo(int est1, int est2){
        String tempo=null;
        if((est1==1 && est2==2)||(est1==2 && est2==1))
            tempo="4 minutos";
        if((est1==1 && est2==3)||(est1==3 && est2==1))
            tempo="8 minutos e 30 segundos";
        if((est1==1 && est2==4)||(est1==4 && est2==1))
            tempo="11 minutos e 30 segundos";
        if((est1==1 && est2==5)||(est1==5 && est2==1))
            tempo="15 minutos e 30 segundos";
        if((est1==1 && est2==6)||(est1==6 && est2==1))
            tempo="20 minutos";
        if((est1==1 && est2==7)||(est1==7 && est2==1))
            tempo="22 minutos";
        if((est1==1 && est2==8)||(est1==8 && est2==1))
            tempo="26 minutos";
        if((est1==1 && est2==9)||(est1==9 && est2==1))
            tempo="32 minutos";
        if((est1==1 && est2==10)||(est1==10 && est2==1))
            tempo="36 minutos";
        if((est1==1 && est2==11)||(est1==11 && est2==1))
            tempo="42 minutos";
        if((est1==1 && est2==12)||(est1==12 && est2==1))
            tempo="47 minutos e 30segundos";
        if((est1==1 && est2==13)||(est1==13 && est2==1))
            tempo="55 minutos e 30 segundos";
        if((est1==2 && est2==3)||(est1==3 && est2==2))
            tempo="4 minutos e 30 segundos";
        if((est1==2 && est2==4)||(est1==4 && est2==2))
            tempo="7 minutos e 30 segundos";
        if((est1==2 && est2==5)||(est1==5 && est2==2))
            tempo="11 minutos e 30 segundos";
        if((est1==2 && est2==6)||(est1==6 && est2==2))
            tempo="16 minutos";
        if((est1==2 && est2==7)||(est1==7 && est2==2))
            tempo="18 minutos e 30 segundos";
        if((est1==2 && est2==8)||(est1==8 && est2==2))
            tempo="22 minutos";
        if((est1==2 && est2==9)||(est1==9 && est2==2))
            tempo="28 minutos";
        if((est1==2 && est2==10)||(est1==10 && est2==2))
            tempo="32 minutos";
        if((est1==2 && est2==11)||(est1==11 && est2==2))
            tempo="38 minutos";
        if((est1==2 && est2==12)||(est1==12 && est2==2))
            tempo="43 minutos e 30 segundos";
        if((est1==2 && est2==13)||(est1==13 && est2==2))
            tempo="19 minutos e 30 segundos";
        if((est1==3 && est2==4)||(est1==4 && est2==3))
            tempo="3 minutos";
        if((est1==3 && est2==5)||(est1==5 && est2==3))
            tempo="7 minutos";
        if((est1==3 && est2==6)||(est1==6 && est2==3))
            tempo="11 minutos e 30 segundos";
        if((est1==3 && est2==7)||(est1==7 && est2==3))
            tempo="14 minutos";
        if((est1==3 && est2==8)||(est1==8 && est2==3))
            tempo="17 minutos e 30 segundos";
        if((est1==3 && est2==9)||(est1==9 && est2==3))
            tempo="23 minutos e 30 segundos";
        if((est1==3 && est2==10)||(est1==10 && est2==3))
            tempo="27 minutos e 30 segundos";
        if((est1==3 && est2==11)||(est1==11 && est2==3))
            tempo="33 minutos e 30 segundos";
        if((est1==3 && est2==12)||(est1==12 && est2==3))
            tempo="39 minutos";
        if((est1==3 && est2==13)||(est1==13 && est2==3))
            tempo="47 minutos";
        if((est1==4 && est2==5)||(est1==5 && est2==4))
            tempo="4 minutos";
        if((est1==4 && est2==6)||(est1==6 && est2==4))
            tempo="8 minutos e 30 segundos";
        if((est1==4 && est2==7)||(est1==7 && est2==4))
            tempo="11 minutos";
        if((est1==4 && est2==8)||(est1==8 && est2==4))
            tempo="14 minutos e 30 segundos";
        if((est1==4 && est2==9)||(est1==9 && est2==4))
            tempo="20 minutos e 30 segundos";
        if((est1==4 && est2==10)||(est1==10 && est2==4))
            tempo="24 minutos e 30 segundos";
        if((est1==4 && est2==11)||(est1==11 && est2==4))
            tempo="30 minutos e 30 segundos";
        if((est1==4 && est2==12)||(est1==12 && est2==4))
            tempo="36 minutos";
        if((est1==4 && est2==13)||(est1==13 && est2==4))
            tempo="44 minutos";
        if((est1==5 && est2==6)||(est1==6 && est2==5))
            tempo="4 minutos e 30 segundos";
        if((est1==5 && est2==7)||(est1==7 && est2==5))
            tempo="7 minutos";
        if((est1==5 && est2==8)||(est1==8 && est2==5))
            tempo="10 minutos e 30 segundos";
        if((est1==5 && est2==9)||(est1==9 && est2==5))
            tempo="16 minutos e 30 segundos";
        if((est1==5 && est2==10)||(est1==10 && est2==5))
            tempo="20 minutos e 30 segundos";
        if((est1==5 && est2==11)||(est1==11 && est2==5))
            tempo="26 minutos e 30 segundos";
        if((est1==5 && est2==12)||(est1==12 && est2==5))
            tempo="32 minutos";
        if((est1==5 && est2==13)||(est1==13 && est2==5))
            tempo="40 minutos";
        if((est1==6 && est2==7)||(est1==7 && est2==6))
            tempo="2 minutos e 30 segundos";
        if((est1==6 && est2==8)||(est1==8 && est2==6))
            tempo="6 minutos";
        if((est1==6 && est2==9)||(est1==9 && est2==6))
            tempo="12 minutos";
        if((est1==6 && est2==10)||(est1==10 && est2==6))
            tempo="16 minutos";
        if((est1==6 && est2==11)||(est1==11 && est2==6))
            tempo="22 minutos";
        if((est1==6 && est2==12)||(est1==12 && est2==6))
            tempo="27 minutos e 30 segundos";
        if((est1==6 && est2==13)||(est1==13 && est2==6))
            tempo="35 minutos e 30 segundos";
        if((est1==7 && est2==8)||(est1==8 && est2==7))
            tempo="3 minutos e 30 segundos";
        if((est1==7 && est2==9)||(est1==9 && est2==7))
            tempo="9 minutos e 30 segundos";
        if((est1==7 && est2==10)||(est1==10 && est2==7))
            tempo="13 minutos e 30 segundos";
        if((est1==7 && est2==11)||(est1==11 && est2==7))
            tempo="19 minutos e 30 segundos";
        if((est1==7 && est2==12)||(est1==12 && est2==7))
            tempo="25 minutos";
        if((est1==7 && est2==13)||(est1==13 && est2==7))
            tempo="33 minutos";
        if((est1==8 && est2==9)||(est1==9 && est2==8))
            tempo="6 minutos";
        if((est1==8 && est2==10)||(est1==10 && est2==8))
            tempo="10 minutos";
        if((est1==8 && est2==11)||(est1==11 && est2==8))
            tempo="16 minutos";
        if((est1==8 && est2==12)||(est1==12 && est2==8))
            tempo="5 minutos e 30 segundos";
        if((est1==8 && est2==13)||(est1==13 && est2==8))
            tempo="13 minutos e 30 segundos";
        if((est1==9 && est2==10)||(est1==10 && est2==9))
            tempo="4 minutos";
        if((est1==9 && est2==11)||(est1==11 && est2==9))
            tempo="10 minutos";
        if((est1==9 && est2==12)||(est1==12 && est2==9))
            tempo="15 minutos e 30 segundos";
        if((est1==9 && est2==13)||(est1==13 && est2==9))
            tempo="23 minutos e 30 segundos";
        if((est1==10 && est2==11)||(est1==11 && est2==10))
            tempo="6 minutos";
        if((est1==10 && est2==12)||(est1==12 && est2==10))
            tempo="11 minutos e 30 sugundos";
        if((est1==10 && est2==13)||(est1==13 && est2==10))
            tempo="19 minutos e 30 segundos";
        if((est1==11 && est2==12)||(est1==12 && est2==11))
            tempo="5 minutos e 30segundos";
        if((est1==11 && est2==13)||(est1==13 && est2==11))
            tempo="13 minutos e 30 segundos";
        if((est1==12 && est2==13)||(est1==13 && est2==12))
            tempo="8 minutos";
        return tempo;
    }
    
    @Override
    public void create(Tarifa t){
    Connection con = Connection_Factory.getConnection();
    PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("INSERT INTO tb_tarifas (bilhete, tarifa) VALUES (?,?)");
            stmt.setString(1, t.getBilhete());
            stmt.setFloat(2, t.getPreco());  
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tarifa registrada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(Implementacao_Trem.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar."+ex);
        }finally{
            Connection_Factory.closeConnection(con, stmt);
        }
    }
    @Override
    public void update(Tarifa t){
        Connection con = Connection_Factory.getConnection();
    PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("UPDATE tb_tarifas SET tarifa=? WHERE bilhete=?");
            stmt.setString(1, t.getBilhete());
            stmt.setFloat(2, t.getPreco());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tarifa atualizada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(Implementacao_Trem.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar."+ex);
        }finally{
            Connection_Factory.closeConnection(con, stmt);
        }
    }
    @Override
    public List<Tarifa> readPesquisaNome(String busca){
                Connection con = Connection_Factory.getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        List<Tarifa> lt = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_tarifas WHERE bilhete LIKE ?");
            stmt.setString(1, "%"+busca+"%");
            rs=stmt.executeQuery();
            
            while(rs.next()){
                Tarifa t = new Tarifa();
                t.setBilhete(rs.getString("bilhete"));
                t.setPreco(rs.getFloat("tarifa"));
                lt.add(t);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Implementacao_Trem.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Connection_Factory.closeConnection(con, stmt, rs);
        }
        return lt;
    }
}
