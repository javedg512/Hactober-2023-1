String menuData = "Maxima \n";
						menuData += "1.Two Numbers \n";
						menuData += "2.Three Numbers \n";
						menuData += "3.Four Numbers \n";
						menuData += "4.Exit \n";
						
						String menuData1 = "Maxima Minima\n";
						menuData1 += "1.Maximum Number  \n";
						menuData1 += "2.Minimum Number \n";
						menuData1 += "3.Middle \n";
						menuData1 += "4.Exit \n";
						
						while (true){
							int choice = Integer.parseInt(JOptionPane.showInputDialog(menuData));
							switch(choice){
									
									case 1 : 
										int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number : "));
										int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number : "));
										int choice1 = Integer.parseInt(JOptionPane.showInputDialog(menuData1));
										switch(choice1){
											case 1 :
												if (num1 > num2 ){
													JOptionPane.showMessageDialog(null,"The maximum is"+num1);
												}
												else {
													JOptionPane.showMessageDialog(null,"The maximum is"+num2);
												
												} 
												break;
											case 2 : 	
												if (num1 < num2 ){
													JOptionPane.showMessageDialog(null,"The minimum is"+num1);
												}
												else {
													JOptionPane.showMessageDialog(null,"The minimum is"+num2);
												
												}
												break;
												case 3 : 	
												if (num1 < num2 ){
													JOptionPane.showMessageDialog(null,"The minimum is"+num1);
												}
												else {
													JOptionPane.showMessageDialog(null,"The minimum is"+num2);
												
												}
												break;
												
										}if(choice1 == 4) System.exit(0);
										break;
										
									case 2 : 
										num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number : "));
										num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number : "));
										int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Third Number : "));
										 choice1 = Integer.parseInt(JOptionPane.showInputDialog(menuData1));
										switch(choice1){
										case 1 :
											if (num1 > num2 && num1 > num3){
												
												JOptionPane.showMessageDialog(null,"The maximum is"+num1);
											}
											else if (num3 > num2 && num3> num1)
											{
												JOptionPane.showMessageDialog(null,"The maximum is"+num3);
											}
											else {
												JOptionPane.showMessageDialog(null,"The maximum is"+num2);
											
											} 
											break;
										case 2 :
											if (num1 < num2 && num1 < num3){
												
												JOptionPane.showMessageDialog(null,"The minimum is"+num1);
											}
											else if (num3 < num2 && num3 < num1)
											{
												JOptionPane.showMessageDialog(null,"The minimum is"+num3);
											}
											else {
												JOptionPane.showMessageDialog(null,"The minimum is"+num2);
											
											} 
											break;
										case 3 : 	
											if (num1 > num2 && num1 < num3){
												
												JOptionPane.showMessageDialog(null,"The middle is"+num1);
											}
											else if (num3 > num2 && num3 < num1)
											{
												JOptionPane.showMessageDialog(null,"The middle is"+num3);
											}
											else {
												JOptionPane.showMessageDialog(null,"The middle is"+num2);
											
											} 
											break;
											
											
										}if(choice1 == 4) System.exit(0);
										break;
										case 3 : 
										num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number : "));
										num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number : "));
										num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Third Number : "));
										int num4 = Integer.parseInt(JOptionPane.showInputDialog("Enter Fourth Number : "));
										
										if (num1 > num2 && num1 > num3 && num1 > num4){
											
											JOptionPane.showMessageDialog(null,"The maximum is"+num1);
										}
										else if (num3 > num2 && num3> num1 && num3 > num4)
										{
											JOptionPane.showMessageDialog(null,"The maximum is"+num3);
										}
										else if (num4 > num2 && num4> num1 && num4 > num3)
										{
											JOptionPane.showMessageDialog(null,"The maximum is"+num4);
										}
										else {
											JOptionPane.showMessageDialog(null,"The maximum is"+num2);
										} 
										break;	
							}if(choice==4) System.exit(0);
						}
