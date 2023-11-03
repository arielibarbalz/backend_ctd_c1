package com.backend.clase15.model;

public class Entrenador {

        private String nombre;

        public Entrenador(String nombre) {
                this.nombre = nombre;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        @Override
        public String toString(){
                return "-- Entrenador -- \nNombre: " + nombre;
        }
}
