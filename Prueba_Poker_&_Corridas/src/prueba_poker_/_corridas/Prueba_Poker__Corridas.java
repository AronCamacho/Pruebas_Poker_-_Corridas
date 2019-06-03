/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_poker_._corridas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AronChocama
 */
public class Prueba_Poker__Corridas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String menu="<---Elija una opcion--->\n"
                   +"1. POKER \n"+
                    "2. CORRIDAS";
        String opcionStr = JOptionPane.showInputDialog(null,menu,"PRUEBAS", JOptionPane.INFORMATION_MESSAGE);
        int opcion = Integer.parseInt(opcionStr);
        double[] serie = {
                            0.64138,
                            0.55837,
                            0.81593,
                            0.04994,
                            0.61265,
                            0.06787,
                            0.30465,
                            0.54264,
                            0.81159,
                            0.61163,
                            0.47681,
                            0.52127,
                            0.69239,
                            0.92006,
                            0.37913,
                            0.32035,
                            0.37248,
                            0.57836,
                            0.19180,
                            0.28920,
                            0.79302,
                            0.08124,
                            0.53401,
                            0.48201,
                            0.03268,
                            0.38087,
                            0.68054,
                            0.69251,
                            0.60284,
                            0.69351,
                            0.64264,
                            0.22409,
                            0.80242,
                            0.58071,
                            0.31629,
                            0.03585,
                            0.46034,
                            0.57039,
                            0.15096,
                            0.15523,
                            0.64388,
                            0.83371,
                            0.04198,
                            0.49796,
                            0.16087,
                            0.68317,
                            0.39974,
                            0.48571,
                            0.93409,
                            0.90760,
                            0.59867,
                            0.10238,
                            0.57576,
                            0.20976,
                            0.25934,
                            0.27937,
                            0.74035,
                            0.26204,
                            0.06659,
                            0.75064,
                            0.08396,
                            0.14600,
                            0.07700,
                            0.76808,
                            0.90808,
                            0.19125,
                            0.71868,
                            0.31794,
                            0.81621,
                            0.47948,
                            0.93661,
                            0.72871,
                            0.96122,
                            0.52904,
                            0.18658,
                            0.81139,
                            0.71166,
                            0.92589,
                            0.23092,
                            0.92253,
                            0.81515,
                            0.91642,
                            0.93912,
                            0.59072,
                            0.38699,
                            0.22783,
                            0.54638,
                            0.59725,
                            0.30204,
                            0.63166,
                            0.07339,
                            0.65144,
                            0.81809,
                            0.01614,
                            0.86034,
                            0.05137,
                            0.50878,
                            0.98290,
                            0.41824,
                            0.97056,

        };
        ArrayList<Integer> bits = new ArrayList<>();
        ArrayList<Integer> numeros= new ArrayList<>();
        int i,corridas, dato;
        
        
        switch(opcion){
            case 1: 
                
                double arreglo[] = null;
                double p=0;
                int p1=0;
                for ( i = 0; i < serie.length; i++) {
                  
                    p1 = (int)Math.round(serie[i]*100000);
                    numeros.add(p1);
                    
                 
                    
                    
                    
                    
                    
                }
                
                
                ArrayList<Integer> digitos= new ArrayList<>();
                int num=numeros.get(0);
                int naux=0;
                int naux2=0;
                for (int j = 0; j <5; j++) {
                    naux=num%10;
                    num=num/10;
                    digitos.add(naux);
                    
                    
                }
            
                
                
                System.out.println(digitos);
                
                
                int d1=0;
                int d2=0;
                int d3=0;
                int d4=0;
                int d5=0;
                
                
                
                
                
                for (int j = 0; j <5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if(digitos.get(j)==digitos.get(k)){
                            d1=d1+1;
                            
                        }else{
                            d1=0;
                        }
//                        if(digitos.get(j+1)==digitos.get(k)){
//                            d2=d1+1;
//                            
//                        }else{
//                            d2=0;
//                        }
//                        if(digitos.get(j+2)==digitos.get(k)){
//                            d3=d1+1;
//                            
//                        }else{
//                            d3=0;
//                        }
//                        if(digitos.get(j+3)==digitos.get(k)){
//                            d4=d1+1;
//                            
//                        }else{
//                            d4=0;
//                        }
//                        if(digitos.get(j+4)==digitos.get(k)){
//                            d5=d1+1;
//                            
//                        }else{
//                            d5=0;
//                        }
                        
                       
                    }
                     
                }
                
               
                
                
                
                
                System.out.println(d1);
                
                
                
                
               //System.out.println(numeros); 
               
                
                
                
                
                
                
                
               
                break;
                
            case 2: 
                
                double media,desviacion,zo;
                double h=0.5;
                double n1=0;
                double n2=0;
                double z=1.96;
                
                
                for (i = 0; i < serie.length; i++) {
                    if(serie[i]>=0.5){
                    bits.add(1);
                    
                   
                        
                    }else{
                      bits.add(0);
                    }
                
                    //aux=aux+serie[i]+"-";
                    
                    
                    //System.out.println(serie[i]);
                }
                
                for (i=0; i<bits.size(); i++){
                    System.out.print(bits.get(i));
                    
                    
                    }
                JOptionPane.showMessageDialog(null,bits);
                
                
                
                //CORRIDAS
                corridas=1;
                
                dato= bits.get(0);
                for (i=0; i<bits.size(); i++){
                    if (bits.get(i) != dato){
                    corridas++;
                    dato = bits.get(i);
                        }
                    }
                    System.out.println("\n"
                    + "Corridas " + corridas);
                    
                    
                 //calculo de n1 y n2
                 int cont=0;
                 int cont2=0;
                 
                 for (i = 0;  i<bits.size(); i++) {
                     if(bits.get(i)==1){
                         cont=cont+1;
                         n1=cont;
                         
                     }else{
                         
                             cont2=cont2+1;
                             n2=cont2;
                             
                         
                         
                     }
                     
                    
                }
                     System.out.println("n1="+n1+"\n"+"n2="+n2);
                     
                    //***** MEDIA***//
                     
                    media=((2*n1*n2)/(n1+n2))+1;
                    System.out.println("media="+ media);
                     
                    //****Desviacion Standar****///
                    double n = n1+n2;
                    double nc =Math.pow(n, 2);
                            
                    double dv1 = 2*n1*n2*(2*n1*n2-n1-n2);
                    double dv2=nc*(n1+n2-1);
                    double dv3=dv1/dv2;
                    desviacion= Math.sqrt(dv3);
                    
                    System.out.println("desviacion="+desviacion);
                    
                    /*** Estadistico Z***/
                    
                    if(corridas<media){
                       zo=(corridas+h-media)/desviacion;
                        
                        
                    }else{
                        
                        zo=(corridas-h-media)/desviacion;
                        
                    }
                    
                    
                    
                    System.out.println("Z="+zo);
                    
                    
               JOptionPane.showMessageDialog(null,"corridas ="+corridas+"\n"+"Promedio Corridas ="+media+"\n"+"Desviacion Estandat ="+desviacion+"\n"+"Z ="+zo+"\n");     
                    
               /***Validacion***/
                    
                    if(zo<z){
                        
                        System.out.println("PASA LA PRUEBA");
                        JOptionPane.showMessageDialog(null,"PASA LA PRUEBA!!!");
                        
                    }else{
                        System.out.println("NO PASA LA PRUEBA");
                        JOptionPane.showMessageDialog(null,"NO PASA LA PRUEBA!!!");
                    }
                    
                    
                    
                    
                    
                    
                     
               break;
            default:
                JOptionPane.showMessageDialog(null,"ingrese un valor Valido", "Error", JOptionPane.ERROR_MESSAGE);
               
              
        
        
        } 
        
        
        
    }
    
}
