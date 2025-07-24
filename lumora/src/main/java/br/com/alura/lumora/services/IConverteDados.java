package br.com.alura.lumora.services;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
