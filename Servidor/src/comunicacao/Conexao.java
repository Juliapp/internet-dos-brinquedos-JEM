package comunicacao;

import facade.ServidorFacade;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class Conexao{
    private ServerSocket serverSocket;
    private Solicitante id;
    private int porta;
    private ConectionIO io;

    
    public Conexao(Solicitante id){
        this.id = id;
    }
    
    public void rodar() throws IOException {
        conectar();
        //Socket socket = esperandoConexao();
        
        // io = new ConectionIO(socket, id);
        //Thread threadIO = new Thread(io);
        
        //this.tratarConexao(socket);
    }
    

    public ServerSocket getSocket(){
        return serverSocket;

    }
    
    private void criarServerSocket(int porta) throws IOException {
        //cria um serverSocket se tiver em só uma placa de rede
        serverSocket = new ServerSocket(porta);
    }
   
    
        private Socket esperandoConexao() throws IOException {
        //Faz o serverSocket esperar uma conexão, só da o retorno quando a conexão não é estabelecida
        System.out.println("Esperando a resposta do cliente .....");
        System.out.println("Fique atento se precisar dar permição ao Firewall do seu Sistema Operacional");
        Socket socket = serverSocket.accept();
        System.out.println("conexão estabelecida com o cliente");
        return socket;
    }
    
    private void conectar() throws IOException{

        System.out.println("Qual a porta?");
        Scanner s = new Scanner(System.in);
        String sporta = s.nextLine();   
        int porta = Integer.parseInt(sporta);

        criarServerSocket(porta);
 
    }
    
}


