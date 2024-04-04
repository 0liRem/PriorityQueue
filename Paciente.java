public class Paciente {
        private String nombre;
        private String servicio;
        private String prioridad;
    
        // Constructor
        public Paciente(String nombre, String servicio, String prioridad) {
            this.nombre = nombre;
            this.servicio = servicio;
            this.prioridad = prioridad;
        }
    
        // Métodos getter y setter para cada atributo
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getServicio() {
            return servicio;
        }
    
        public void setServicio(String servicio) {
            this.servicio = servicio;
        }
    
        public String getPrioridad() {
            return prioridad;
        }
    
        public void setPrioridad(String prioridad) {
            this.prioridad = prioridad;
        }
    
}
