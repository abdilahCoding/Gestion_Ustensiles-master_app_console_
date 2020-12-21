
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Conection con = new Conection();
		con.Connect();
		
		AssietteRonde assietteronde = new AssietteRonde();
		AssietteCarree assiettecarree = new AssietteCarree();
		Cuillere cuillere = new Cuillere();
		
		int anne_de_fabrication =0;
		double rayon =0;
		double cote =0;
		double longueur =0;
		int id = 0;
		
		
		while (true) {
			System.out.println(" _________________________________\n"
							 + " 1) Ajouter Ustensile \n"
							 + " 2) Afficher Ustensile \n"
							 + " 3) Afficher Surface Assiettes \n"
							 + " 4) Afficher Valeur Totale  \n"
							 + " 5) Modifier Ustensile : 5");
			String choix=scan.next();
			switch(choix) {
			 case "1":
				 
				//add
				 System.out.println("Anne de fabrication : ");
				 anne_de_fabrication = scan.nextInt();
				 System.out.println(" Ajouter AssietteRonde  : 1 \n Ajouter AssietteCarree : 2 \n Cuillere  3");
				 String choix2=scan.next();
				 switch(choix2) {
				  case "1":
					 //add AssietteRonde
					  System.out.println(" \n rayon de AssietteRonde : ");
					  rayon = scan.nextDouble();
					  assietteronde.create_data(rayon,anne_de_fabrication);
					  
					  break;
				  case "2":
					  //add AssietteCarree
					  System.out.println(" \n cote de AssietteCarree : ");
					  cote = scan.nextDouble();
					  assiettecarree.create_data(cote,anne_de_fabrication);
					  
					  break;
				  case "3":
					  //add AssietteCarree
					  System.out.println(" \n Longueur de Cuillere : ");
					  longueur = scan.nextDouble();
					  cuillere.create_data(longueur,anne_de_fabrication);
					  
					  break;
					  default:
				 }
				 
				 //end case 1
				 break;
			 case "2":
				 //select
				 System.out.println(" Afficher AssietteRonde  : 1 \n Afficher AssietteCarree : 2 \n Afficher Cuillere       : 3");
				 String affiche=scan.next();
				 switch(affiche) {
				 case "1":
					 //1
					 System.out.println("\n \t -----------------"
					 				  + "\n \t Les AssietteRonde "
					 				  + "\n \t ----------------- ");
					 assietteronde.read_data();
					 break;
				 case "2":
					 //2
					 System.out.println("\n \t ------------------"
					 				  + "\n \t Les AssietteCarree "
					 				  + "\n \t  ------------------ ");
					 assiettecarree.read_data();
					 break;
				 case "3":
					 //3
					 System.out.println("\n \t ------------------"
					 				  + "\n \t Les AssietteCarree "
					 				  + "\n \t ------------------ ");
					 cuillere.afficherCuilleres();
					 break;
				 default:
						 
				 }
				 //cuillere.tt();
				 break;
			 case "3":
				 //select


				 System.out.println(" Surface totale AssietteRonde  : 1 \n Surface totale AssietteCarree : 2 ");
				 String choix3=scan.next();
				 switch(choix3) {
					 case "1":
						 //1
						 assietteronde.afficherSurfaceAssiettes(1);
						 break;
					 case "2":
						 //2
						 assiettecarree.afficherSurfaceAssiettes(2);
						 break;
					 default:
				 }
				 //cuillere.tt();
				 break;
			 case "4":
				 //afficherValeurTotale
				 //AssietteRonde
				 System.out.println(" Cuillere       : 1 \n AssietteRonde  : 2 \n AssietteCarree : 3");
				 String choix4=scan.next();
				 switch(choix4) {
				 	case "1":
				 		//1
				 		cuillere.afficherValeurTotale(1);
				 		break;
				 	case "2":
				 		//2
				 		assietteronde.afficherValeurTotale(2);
				 		break;
				 	case "3":
				 		//3
				 		assiettecarree.afficherValeurTotale(3);
				 		break;
				 	default:
				 }
				 
				 break;
			 case "5":
				 //modifier
					System.out.println(" Modifier Cuilleres      : 1 \n Modifier AssietteRonde  : 2 \n Modifier AssietteCarree : 3");
					String choix5=scan.next();
					switch(choix5) {
						case "1":
							//1
							cuillere.afficherCuilleres();
							System.out.println("\n--------------------------------");
							System.out.println(" ID pour Modifier : \n");
							id = scan.nextInt();
							System.out.println(" Longeur pour Modifier : \n");
							longueur = scan.nextDouble();
							System.out.println(" Anne De Fabrication pour Modifier : \n");
							anne_de_fabrication = scan.nextInt();
							//methode 1 for update
							//cuillere.update_data(id, longueur, anne_de_fabrication);
							
							//methode 2 for update
							cuillere.update_global_data(id, longueur, anne_de_fabrication ,3);
							
							
							break;
						case "2":
							//2
							assietteronde.read_data();
							System.out.println("\n--------------------------------");
							System.out.println(" ID pour Modifier : \n");
							id = scan.nextInt();
							System.out.println(" Rayon pour Modifier : \n");
							rayon = scan.nextDouble();
							System.out.println(" Anne De Fabrication pour Modifier : \n");
							anne_de_fabrication = scan.nextInt();
							//methode 1 for update
							//assietteronde.update_data(id, rayon, anne_de_fabrication);
							
							//methode 2 for update
							assietteronde.update_global_data(id, rayon, anne_de_fabrication ,1);
							break;
						case "3":
							//3
							assiettecarree.read_data();
							System.out.println("\n--------------------------------");
							System.out.println(" ID pour Modifier : \n");
							id = scan.nextInt();
							System.out.println(" Cote pour Modifier : \n");
							cote = scan.nextDouble();
							System.out.println(" Anne De Fabrication pour Modifier : \n");
							anne_de_fabrication = scan.nextInt();
							//methode 1 for update
							//assiettecarree.update_data(id, cote, anne_de_fabrication);
							
							//methode 2 for update
							assiettecarree.update_global_data(id, cote, anne_de_fabrication ,2);
							break;
						default:
					}
				 default:
					 
			}
		}

	}

}
