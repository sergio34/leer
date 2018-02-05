 private void leerFichero(){
        try {
            FileReader lector = new FileReader("G:\\DAW\\UF1\\Java\\animalesjava.txt");
            BufferedReader datoslector = new BufferedReader(lector); 
            String cadena = "";
            while ((cadena = datoslector.readLine()) != null){
                Animal ani = new Animal();
                String columna[] = cadena.split("-");
                ani.setNom(columna[0]);
                ani.setRaza(columna[1]);
                ani.setPais(columna[2]);
                ani.setEdat(Integer.parseInt(columna[3]));
                listaAnimales.add(ani);
            }
        } catch (IOException ex) {
            Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void editarFichero() {
        try {
            BufferedWriter datos = new BufferedWriter(new FileWriter("G:\\DAW\\UF1\\Java\\animalesjava.txt"));
            for (Animal ani:listaAnimales){ 
                    datos.write(ani.getNom()+"-");
                    datos.write(ani.getRaza()+"-");
                    datos.write(ani.getPais()+"-");
                    datos.write(String.valueOf(ani.getEdat()));
 
                datos.newLine();
            }
            datos.close();
            JOptionPane.showMessageDialog(null,"Se ha ejecutado correctamente");
         } catch (IOException ex) {
            Logger.getLogger(Vistaanimales.class.getName()).log(Level.SEVERE, null, ex);
        }
}
