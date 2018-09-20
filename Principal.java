
import java.util.Scanner;
public class Principal{
public static Scanner sc = new Scanner(System.in);
public static void main(String args[]){
Cinema cine = new Cinema();
String comando;
String help = "\t============= help =====================\n"+
					  "\tinit _numero : de cadeiras\n"+
					  "\treservar _nome_telefone_posicao da cadeira : reservar cinema\n"+
					  "\tcancelar _nome : cancelar reservar\n"+
					  "\tshow: mostra as cadeiras do cinema\n"+
					  "\tend: sai do programa\n"+
					  "\t========================================\n";

while(true){

System.out.print("Digite um comando (help para ver os comandos) ");
comando = sc.nextLine();

         if(comando.equals("help")){
				System.out.println(help);
				
			 
        }else if(comando.equals("end")){
				System.out.println("  Até a próxima :)");
				break;
			}else{ 
		 

                String c[] = comando.split(" ");
                int p;
                switch(c[0]){
                            case "init":

                                         p = Integer.parseInt(c[1]);
                                         System.out.println(cine.criar(p));



                                    break;
                            case "cancelar":
                                               
                                         System.out.println(cine.cancelar(c[1]));


                                    break;
                            case "reservar":

                                         p = Integer.parseInt(c[3]);
                                         System.out.println(cine.reservar(c[1],c[2],p));
                                         

                                    break;
                            case "show":

                                         System.out.print("  [");
                                         if(cine.teste == true){
                                         System.out.print( cine.toString());
                                         }
                                         System.out.println("]");

                                    break;
                            default:

                                    System.out.println("  Comando inválido.");

                            }
            }


}










}
}



	    