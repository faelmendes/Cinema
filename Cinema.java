
public class Cinema{
	Cliente[] cadeira;
        boolean teste = false;
        
	public String criar(int numero){
            cadeira = new Cliente[numero];
            teste = true;
            return "sucesso";
         }


	public String reservar(String id, String fone, int posicao){
            if (posicao > cadeira.length-1) {
		       return "O cinema nao possui esse numero de cadeiras, lembrete comessando do zero";
		}
            
            for(int i = 0; i < cadeira.length;i++){
                 if(cadeira[i] != null){
                    if(cadeira[i].id.equals(id)){
                       return "failure: cliente ja esta no cinema";
                    }
                 }
            }
            
            if(cadeira[posicao] == null){
             Cliente pessoa = new Cliente(id,fone);
             cadeira[posicao]= pessoa;
             return "success";
            
              }else{
                 return "failure: cadeira ja esta ocupada";
            }    
        }
        
        
        public String cancelar(String id){
            for (int i = 0;i < cadeira.length ;i++ ) {
                 if(cadeira[i] != null){
                    if(cadeira[i].id.equals(id)){
                        cadeira[i] = null;
                        return "success";
                    } 
                        
                    }
                 }
                   
                     
           return "failure: cliente nao esta no cinema";        
                  
        }
            
        
        
        
        public String toString(){
            String nome = "";
        
             for (int i = 0;i < cadeira.length ;i++ ) {
                 if(cadeira[i] != null){
                   nome+=" "+cadeira[i].id+":"+cadeira[i].fone+" "; 
                 }else{ 
                   nome+=" - ";
                     
                   }
                
        }
             
             return nome; 
             

        }    
  





}
