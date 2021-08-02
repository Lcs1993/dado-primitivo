import java.util.Scanner;

public class ExemploDadoPrimitivo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do alunos: ");
		String nome=teclado.nextLine();
		System.out.print("Digite a nota do aluno: ");
		float nota =teclado.nextFloat();
		
		
		System.out.println("a sua nota é "+nota);
		System.out.printf("A nota do %s é: %.2f",nome,nota);
		System.out.format("\n A nota do %s é: %.2f",nome,nota);
	}

}
