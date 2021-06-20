
package FactoryMethod;

import static controllers.controllerUsuario.buscaUsuarioLogin;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Usuario;
import static views.cores.ANSI_GREEN;
import static views.cores.ANSI_RESET;
import static views.cores.ANSI_WHITE;
import static views.cores.ANSI_YELLOW;
import static views.usuarioView.retornaUsuario;

public class RecadoDiversos implements RecadoInterface {

    @Override
    public void enviaRecados(List<Usuario> usuarios) {
        Scanner in = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Informe seu login: " + ANSI_RESET);
        String meuLogin = in.nextLine();
        if (retornaUsuario(meuLogin, usuarios) == null) {
            System.err.println("LOGIN INVÁLIDO!");
        } else {
            System.out.println(ANSI_YELLOW + "Informe o login do usuário que vai receber a mensagem:" + ANSI_RESET);
            System.out.print(ANSI_WHITE + "->" + ANSI_RESET);
            String login = in.nextLine();
            Usuario conta = buscaUsuarioLogin(login, usuarios);
            if (conta == null) {
                System.err.println("LOGIN INVÁLIDO!");
            } else if (conta == retornaUsuario(meuLogin, usuarios)) {
                System.err.println("VOCÊ NÃO PODE ENVIAR MENSAGEM A SI MESMO!");
            } else {
                System.out.println(ANSI_YELLOW + "Você escolheu o tópico diversos!" + ANSI_RESET);
                        System.out.println(ANSI_GREEN + "Informe o recado que você deseja enviar ao login " + ANSI_RESET + login);
                        in.nextLine();
                        System.out.print(ANSI_WHITE + "->" + ANSI_RESET);
                        String recadoJogos = in.nextLine();
                        ArrayList<models.Recado> recadosJogos = conta.getRecados();
                        models.Recado mensagemJogos = new models.Recado(recadoJogos, retornaUsuario(meuLogin, usuarios).getLogin(), "Diversos");
                        recadosJogos.add(mensagemJogos);
                        System.out.println(ANSI_GREEN + "MENSAGEM ENVIADA!" + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "TÓPICO: DIVERSOS." + ANSI_RESET);
            }
        }
    }
    }
    

