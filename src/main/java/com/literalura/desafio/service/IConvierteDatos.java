package com.literalura.desafio.service;

public interface IConvierteDatos {


    <T> T obtenerDatos(String json, Class<T> clase);
}
