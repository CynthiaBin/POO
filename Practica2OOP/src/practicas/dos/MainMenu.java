package practicas.dos;

import java.util.Scanner;

public class MainMenu {
	
	private static final int OPTION_SET_MONTH = 1;
	private static final int OPTION_SET_INCOMES = 2;
	private static final int OPTION_SET_EXPENSES = 3;
	private static final int OPTION_LIST_INCOMES = 4;
	private static final int OPTION_LIST_EXPENSES = 5;
	private static final int OPTION_CALC = 6;
	private static final int OPTION_EXIT = 7;
	
	private static void print(CalculadoraDeImpuestos calc)
	{
		System.out.println("CALCULADOR DE IMPUESTOS");
		System.out.format("%d. Establecer mes de captura ",MainMenu.OPTION_SET_MONTH);
		System.out.format("(Mes actual es %s)",calc.getCaptureMonth());
		System.out.println();
		System.out.format("%d. Captura de ingresos",MainMenu.OPTION_SET_INCOMES);
		System.out.println();
		System.out.format("%d. Captura de gastos:",MainMenu.OPTION_SET_EXPENSES);
		System.out.println();
		System.out.format("%d. Mostrar lista de ingresos anual",MainMenu.OPTION_LIST_INCOMES);
		System.out.println();
		System.out.format("%d. Mostrar lista de gastos anual",MainMenu.OPTION_LIST_EXPENSES);
		System.out.println();
		System.out.format("%d. Calculo de impuestos anual",MainMenu.OPTION_CALC);
		System.out.println();
		System.out.format("%d. Salir",MainMenu.OPTION_EXIT);
		System.out.println();
		System.out.print("Selecciona una opción: ");
	}
	
	private static void exec(CalculadoraDeImpuestos calc, int option)
	{
		switch(option)
		{
		case MainMenu.OPTION_SET_MONTH:
			calc.setCaptureMonth();
			break;
		case MainMenu.OPTION_SET_INCOMES:
			calc.captureCurrentIncome();
			break;
		case MainMenu.OPTION_SET_EXPENSES:
			calc.captureCurrentExpense();
			break;
		case MainMenu.OPTION_LIST_INCOMES:
			calc.listIncomes();
			break;
		case MainMenu.OPTION_LIST_EXPENSES:
			break;
		case MainMenu.OPTION_CALC:
			break;
		default:
			System.out.println("Opción inválida");
		}
	}
	
	public static void main(String[] args) {
		int option;
		Scanner scanner = new Scanner(System.in);
		CalculadoraDeImpuestos calc = new CalculadoraDeImpuestos();
		do
		{
			MainMenu.print(calc);
			option = scanner.nextInt();
			
			if(option != MainMenu.OPTION_EXIT)
			{
				MainMenu.exec(calc,option);
				System.out.println("Presione entrar para continuar...");
				scanner.nextLine();
				scanner.nextLine();
			}
			
		}while(option != MainMenu.OPTION_EXIT);
		
		scanner.close();
	}

}
