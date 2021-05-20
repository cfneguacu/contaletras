package contaletras;

public class ContaLetras {

	public static void main(String[] args) {
		
		String teste = "teste";
		int contvogal = 0;
		int contconsoantes = 0;
		
		for (int i = 0; i < teste.length();i++) {
			
			switch(teste.charAt(i)){
			
			case 'a': case 'e':case 'i':case 'o':case 'u':case 'A': case 'E':case 'I':case 'O':case 'U':
				
				contvogal++;
				
				break;
				
			default:
				
				if((char)teste.charAt(i)>=0 && (char)teste.charAt(i)<=64 ||(char)teste.charAt(i)>=91 && (char)teste.charAt(i)<=96 ) {
					
					break;
					
				}
				
			contconsoantes++;
				
			}
			
		}
		
		System.out.println("Vogal "+contvogal);
		System.out.println("Consoantes "+contconsoantes);
		
	}

}
