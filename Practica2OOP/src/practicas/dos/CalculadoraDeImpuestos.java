package practicas.dos;

import java.util.Scanner;

public class CalculadoraDeImpuestos {
	
	private String[] months;
	private Double[] expenses;
	private Double[] incomes;
	public int index_month; 
	
	private Scanner scanner;
	
	CalculadoraDeImpuestos(){
		this.index_month = 0;
		this.fillMonths();
		this.initializeExpenses();
		this.initializeIncomes();
		this.scanner = new Scanner(System.in);
		this.incomes = new Double[this.months.length];
	}
	
	public void setCaptureMonth(){
		int month, i;
		
		for(i = 0; i< this.months.length; i++ )
		{
			System.out.format("%d. %s\n",i+1,this.months[i]);
		}
		do
		{
			System.out.print("Elige el mes (1-12): ");
			month = scanner.nextInt();
		}while(month < 0 || month > this.months.length);
		
		this.index_month = month;
	}
	
	public String getCaptureMonth(){
		return this.months[this.index_month];
	}
	
	public void captureCurrentIncome(){
		System.out.println("Dame el ingreso para el mes " + this.months[this.index_month]);
		this.incomes[this.index_month] = scanner.nextDouble();
	}
	
	public void captureCurrentExpense(){
		System.out.println("Dame el gasto para el mes " + this.months[this.index_month]);
		this.expenses[this.index_month] = scanner.nextDouble();
	}
	
	public void listIncomes(){
		int i;
		
		for(i=0; i<this.incomes.length; i++){
			System.out.format("%d) %s: %10.2f\n", i+1, this.months[i], this.incomes[i]);
		}
	}
	
	public void listExpenses(){
		int i;
		for(i=0; i<this.expenses.length; i++){
			System.out.format("%d) %s: %.2f\n", i+1, this.months[i], this.expenses[i]);
		}
	}
	
	private void fillMonths()
	{
		this.months = new String[12];
		this.months[0]= "Enero";
		this.months[1]= "Febrero";
		this.months[2]= "Marzo";
		this.months[3]= "Abril";
		this.months[4]= "Mayo";
		this.months[5]= "Junio";
		this.months[6]= "Julio";
		this.months[7]= "Agosto";
		this.months[8]= "Septiembre";
		this.months[9]= "Octubre";
		this.months[10]="Noviembre";
		this.months[11]="Diciembre";
	}
	
	private void initializeExpenses(){
		
		int i;

		this.expenses = new Double[this.months.length];
		
		for(i=0; i<this.expenses.length; i++)
		{
			this.expenses[i] = 0.0;	
		}
	}
	
	private void initializeIncomes(){
		
		int i;

		this.incomes = new Double[this.months.length];
		
		for(i=0; i<this.incomes.length; i++)
		{
			this.incomes[i] = 0.0;	
		}
		
	}
	
	
}
