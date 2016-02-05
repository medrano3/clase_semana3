import java.util.Scanner;
public class Clases4{


	public static void main (String args[]){

		Scanner teclado=new Scanner(System.in);
		boolean continua = false;
		do{


		System.out.println("ingrese primer valor");
		int valor1 = teclado.nextInt();
		System.out.println("ingrese segundo valor");
		int valor2 = teclado.nextInt(); 
		System.out.println("--------------------------------");
		System.out.println("1 = suma");
		System.out.println("2 = resta");
		System.out.println("3 = multiplicacion");
		System.out.println("4 = divicion");
		System.out.println("5 = Exit");
		System.out.println("6 = Cambiar los valores ingresados");
		int menu = teclado.nextInt();
		System.out.println("Resultado =");

		switch(menu){
			case 1:System.out.println(valor1+valor2);
			break;
			case 2:System.out.println(valor1-valor2);
			break;
			case 3:System.out.println(valor1*valor2);
			break;
			case 4:System.out.println(valor1/valor2);
			break;
			case 5:System.exit(0);
			case 6:Clases4.main (null);
			default:break;
		}
		System.out.println("-----------------------------");
		System.out.println("intentar de nuevo Y/N");
		char continuarChar = teclado.next().charAt(0);
		continua = false;
		if(continuarChar=='Y' || continuarChar=='y'){
			continua=true;

		}

	}while(continua);
	}
}