package controllers;

import java.util.List;
import models.Recado;
import models.RecadoSecreto;


public class controllerRecados {
    public static RecadoSecreto buscaSenhaSecreta(String senhaSec, List<RecadoSecreto> recadosSec) {//procura de senha//
        if (recadosSec != null) {
            for (int i = 0; i < recadosSec.size(); i++) {
                if (recadosSec.get(i).getSenhaRecado().equals(senhaSec)) {
                    return recadosSec.get(i);
                }
            }
        }
        return null;

    }
    public static Recado buscaUsuarioRecado(String login, List<Recado> msgMuralPendente) {
        if (msgMuralPendente != null) {
            for (int i = 0; i < msgMuralPendente.size(); i++) {
                if (msgMuralPendente.get(i).getEmitente().equals(login)) {
                    return msgMuralPendente.get(i);
                }
            }
        }
        return null;

    }
    public static Recado buscaUsuarioTopico(String topico, List<Recado> recados){
        if(recados != null){
            for(int i = 0; i < recados.size(); i++){
                if(recados.get(i).getTopico().equals(topico)){
                    return recados.get(i);
                }
            }
        }
        return null;
    }
}
