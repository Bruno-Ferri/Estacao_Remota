/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.TableColumn;
/**
 *
 * @author Admin
 */
public interface Interface_Trem extends Remote{
    public String Mostrainfo(int index) throws RemoteException;
    public ArrayList Comodidades(int index) throws RemoteException;
    public ArrayList Servicos(int index) throws RemoteException;
    public String Mostratempo(int est1, int est2) throws RemoteException;
    public void create(Tarifa t) throws RemoteException;
    public void update(Tarifa t) throws RemoteException;
    public List<Tarifa> readPesquisaNome(String busca) throws RemoteException;
}
