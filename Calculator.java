/**Name:Erin
 *Id:U10108079
 *Exercise:HW7_cal
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.event.ActionEvent;

public class Calculator extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		GridPane pane = new GridPane();

		//create the menu
		MenuBar bar = new MenuBar();
		Menu menu1 = new Menu("檢視(V)");
		Menu menu2 = new Menu("編輯(E)");
		Menu menu3 = new Menu("說明(H)");
		bar.getMenus().addAll(menu1,menu2,menu3);
		pane.add(bar,0,0,6,1);

		//create the display bar
		TextField display = new TextField();
		display.setEditable(false);
		pane.add(display,0,1,6,1);
		display.setText("0");


		//create the buttons
		Button btMC = new Button("MC");
		btMC.setPrefSize(50, 50);
		pane.add(btMC, 0, 2);

		Button btMR = new Button("MR");
		btMR.setPrefSize(50, 50);
		pane.add(btMR, 1, 2);

		Button btMS = new Button("MS");
		btMS.setPrefSize(50, 50);
		pane.add(btMS, 2, 2);

		Button btMplus = new Button("M+");
		btMplus.setPrefSize(50, 50);
		pane.add(btMplus, 3, 2);

		Button btMminus = new Button("M-");
		btMminus.setPrefSize(50, 50);
		pane.add(btMminus, 4, 2);

		Button btBackspace = new Button("←");
		btBackspace.setPrefSize(50, 50);
		pane.add(btBackspace, 0, 3);

		Button btCE = new Button("CE");
		btCE.setPrefSize(50, 50);
		pane.add(btCE, 1, 3);

		Button btC = new Button("C");
		btC.setPrefSize(50, 50);
		pane.add(btC, 2, 3);

		Button btMplusNMminus = new Button("±");
		btMplusNMminus.setPrefSize(50, 50);
		pane.add(btMplusNMminus, 3, 3);

		Button btSqrt = new Button("√");
		btSqrt.setPrefSize(50, 50);
		pane.add(btSqrt, 4, 3);

		Button bt1 = new Button("1");
		bt1.setPrefSize(50, 50);
		pane.add(bt1, 0, 7);

		Button bt2 = new Button("2");
		bt2.setPrefSize(50, 50);
		pane.add(bt2, 1, 7);

		Button bt3 = new Button("3");
		bt3.setPrefSize(50, 50);
		pane.add(bt3, 2, 7);

		Button bt4 = new Button("4");
		bt4.setPrefSize(50, 50);
		pane.add(bt4, 0, 6);

		Button bt5 = new Button("5");
		bt5.setPrefSize(50, 50);
		pane.add(bt5, 1, 6);

		Button bt6 = new Button("6");
		bt6.setPrefSize(50, 50);
		pane.add(bt6, 2, 6);

		Button bt7 = new Button("7");
		bt7.setPrefSize(50, 50);
		pane.add(bt7, 0, 5);

		Button bt8 = new Button("8");
		bt8.setPrefSize(50, 50);
		pane.add(bt8, 1, 5);

		Button bt9 = new Button("9");
		bt9.setPrefSize(50, 50);
		pane.add(bt9, 2, 5);

		Button btDividedBy = new Button("/");
		btDividedBy.setPrefSize(50, 50);
		pane.add(btDividedBy, 3, 5);

		Button btPercent = new Button("%");
		btPercent.setPrefSize(50, 50);
		pane.add(btPercent, 4, 5);

		Button btTines = new Button("*");
		btTines.setPrefSize(50, 50);
		pane.add(btTines, 3, 6);

		Button btDenominator = new Button("1/x");
		btDenominator.setPrefSize(50, 50);
		pane.add(btDenominator, 4, 6);

		Button btMinus = new Button("-");
		btMinus.setPrefSize(50, 50);
		pane.add(btMinus, 3, 7);

		Button btEquals = new Button("=");
		btEquals.setPrefSize(50, 100);
		pane.add(btEquals, 4, 7, 1, 2);

		Button bt0 = new Button("0");
		bt0.setPrefSize(100, 50);
		pane.add(bt0, 0, 8, 2, 1);

		Button btPoint = new Button(".");
		btPoint.setPrefSize(50, 50);
		pane.add(btPoint, 2, 8);

		Button btPlus = new Button("+");
		btPlus.setPrefSize(50, 50);
		pane.add(btPlus, 3, 8);

		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		//Add number function
		bt0.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("0");
			}else{
				display.setText(display.getText()+"0");
			}
		});

		bt1.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("1");
			}else{
				display.setText(display.getText()+"1");
			}
		});

		bt2.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("2");
			}else{
				display.setText(display.getText()+"2");
			}
		});

		bt3.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("3");
			}else{
				display.setText(display.getText()+"3");
			}
		});

		bt4.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("4");
			}else{
				display.setText(display.getText()+"4");
			}
		});

		bt5.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("5");
			}else{
				display.setText(display.getText()+"5");
			}
		});

		bt6.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("6");
			}else{
				display.setText(display.getText()+"6");
			}
		});

		bt7.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("7");
			}else{
				display.setText(display.getText()+"7");
			}
		});

		bt8.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("8");
			}else{
				display.setText(display.getText()+"8");
			}
		});

		bt9.setOnAction((ActionEvent event) -> {
			if((display.getText()).equals("0")){
				display.setText("9");
			}else{
				display.setText(display.getText()+"9");
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("小算盤"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
