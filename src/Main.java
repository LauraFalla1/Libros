public class Main {
    public static void main(String[] args) {

        Libro infantil = new Libro();
        infantil.setTitulo("La vaca Lola");
        infantil.setAutor("Hernando Gonzales");
        infantil.setPaginas(120);

        infantil.mostrarLibro();

        Libro terror = new Libro();
        terror.setTitulo("El terror de sexto B");
        terror.setAutor("Espinoza paz");
        terror.setPaginas(1782);

        terror.mostrarLibro();

        System.out.println(terror.compararLibros(infantil, terror));

    }
}