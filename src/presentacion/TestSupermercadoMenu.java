/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import datos.Compras;
import java.util.Scanner;
import negocio.Abarrote;
import negocio.Aseo;
import negocio.Congelado;
import negocio.Producto;

/**
 *
 * @author Gabriel Serrano
 */
public class TestSupermercadoMenu {

    public static void main(String[] args) {

        //Incialización de variables.
        int option = 0;
        int option2 = 0;
        int precio = 0;
        int dscto = 0;
        int cantidad = 0;
        String descripcion, direccion, elimProd;

        //Instanciación de objetos y clases
        Scanner input = new Scanner(System.in);

        /*Inicializamos el array con el constructor vacío que llenamos en Compras*/
        Compras listaCompra = new Compras();

        System.out.println("***** Bienvenido a Minimarket DuocUC *****");

        do {

            while (true) {
                System.out.println("Ingrese una opción:");
                System.out.println("1. Ingresar producto al carrito.");
                System.out.println("2. Ver lista de productos");
                System.out.println("3. Eliminar producto.");
                System.out.println("4. Emitir boleta.");
                System.out.println("5. Salir");

                while (true) {
                    try {
                        option = input.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Ingreso incorrecto. " + e);
                        System.out.println("Intente nuevamente.");
                        input.next();
                    }
                }
                if (option > 0 && option < 6) {
                    break;
                } else {
                    System.out.println("Opción incorrecta.");
                }
            }

            switch (option) {
                case 1:
                    System.out.println("***** Ingreso de productos ******");
                    System.out.println("¿Qué tipo de producto ingresará?");
                    System.out.println("1. Abarrote.");
                    System.out.println("2. Aseo.");
                    System.out.println("3. Congelado.");
                    System.out.println("4. Líquido.");
                    System.out.println("5. Salir.");

                    while (true) {
                        while (true) {
                            try {
                                option2 = input.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("Ingreso incorrecto. " + e);
                                System.out.println("Intente nuevamente.");
                                input.next();
                            }
                        }
                        if (option2 > 0 && option2 < 6) {
                            break;
                        } else {
                            System.out.println("Opción incorrecta.");
                        }
                    }

                    switch (option2) {
                        case 1:
                            System.out.println("Ingrese la descripción: ");
                            descripcion = input.next();
                            System.out.println("Ingrese el precio: ");
                            precio = input.nextInt();
                            System.out.println("Ingrese la cantidad de productos: ");
                            cantidad = input.nextInt();
                            System.out.println("Ingrese el descuento si está en oferta: ");
                            dscto = input.nextInt();
                            /*Al estar dentro del ciclo podemos crear montones de objetos de manera durante la ejecusión del programa*/
                            Producto abarrote = new Abarrote(precio, dscto, cantidad, descripcion);
                            listaCompra.agregarProducto(abarrote);
                            break;
                        case 2:
                            System.out.println("Ingrese la descripción: ");
                            descripcion = input.next();
                            System.out.println("Ingrese el precio: ");
                            precio = input.nextInt();
                            System.out.println("Ingrese la cantidad de productos: ");
                            cantidad = input.nextInt();
                            System.out.println("Ingrese el descuento si está en oferta: ");
                            dscto = input.nextInt();
                            /*Al estar dentro del ciclo podemos crear montones de objetos de manera durante la ejecusión del programa*/
                            Producto aseo = new Aseo(precio, dscto, cantidad, descripcion);
                            listaCompra.agregarProducto(aseo);
                            break;
                        case 3:
                            System.out.println("Ingrese la descripción: ");
                            descripcion = input.next();
                            System.out.println("Ingrese el precio: ");
                            precio = input.nextInt();
                            System.out.println("Ingrese la cantidad de productos: ");
                            cantidad = input.nextInt();
                            System.out.println("Ingrese el descuento si está en oferta: ");
                            dscto = input.nextInt();
                            /*Al estar dentro del ciclo podemos crear montones de objetos de manera durante la ejecusión del programa*/
                            Producto congelado = new Congelado(precio, dscto, cantidad, descripcion);
                            listaCompra.agregarProducto(congelado);
                            break;
                        case 4:
                            System.out.println("Ingrese la descripción: ");
                            descripcion = input.next();
                            System.out.println("Ingrese el precio: ");
                            precio = input.nextInt();
                            System.out.println("Ingrese la cantidad de productos: ");
                            cantidad = input.nextInt();
                            System.out.println("Ingrese el descuento si está en oferta: ");
                            dscto = input.nextInt();
                            /*Al estar dentro del ciclo podemos crear montones de objetos de manera durante la ejecusión del programa*/
                            Producto liquido = new Congelado(precio, dscto, cantidad, descripcion);
                            listaCompra.agregarProducto(liquido);
                            break;
                        case 5:
                            System.out.println("No se agregaron productos.");
                            break;
                        default:
                            System.out.println("Opción incorrecta.");
                    }

                    break;
                 
                case 2:
                    System.out.println("***** Lista de compras *****");
                    listaCompra.mostrarLista();
                    break;
                case 3:
                    
                    System.out.println("***** Eliminar producto *****");
                    System.out.println("Ingrese el nombre del producto por eliminar: ");
                    elimProd = input.next();
                    if (listaCompra.eliminarProducto(elimProd)) {
                        System.out.println("El producto ha sido eliminado.");
                    } else {
                        System.out.println("No existe el producto.");
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("¿Cuál es la dirección de envío?");
                    direccion = input.nextLine();
                    listaCompra.generarBoleta(direccion);

                    break;
                case 5:
                    System.out.println("Muchas gracias.");
                    System.out.println("Saliendo del sistema...");
                    option = 5;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (option != 5);
        
    }

    }
