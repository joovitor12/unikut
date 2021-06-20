
package FactoryMethod;




public class criaRecado {
    
    public static RecadoInterface criaUser(String topico){
        models.Recado mensagem = new models.Recado("", "", topico);
        switch (mensagem.getTopico()) {
            case "Jogos":
                return new RecadoJogos();
            case "Séries":
                return new RecadoSeries();
            case "Diversos":
                return new RecadoDiversos();
            case "Saudações":
                return new RecadoSaudação();
            default:
                return null;
        }
    }
    
}
