package com.appstracta.generics;

import com.appstracta.poointerfaces.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("Raúl", "Verde"));

		Cliente raul = clientes.iterator().next();

		Cliente[] clientesArreglo = {new Cliente("Raúl", "Verde"),
				new Cliente("Alejandro", "Martínez")
		};

		Integer[] eneterosArreglo = {1, 2, 3};

		List<Cliente> clientesLista = fromArratToList(clientesArreglo);
		List<Integer> enterosLista = fromArratToList(eneterosArreglo);

		clientesLista.forEach(System.out::println);
		enterosLista.forEach(System.out::println);

		List<String> nombres = fromArratToList(new String[] {"Raúl", "Alejandro", "Verde"}, eneterosArreglo);

		nombres.forEach(System.out::println);
	}

	public static <T> List<T> fromArratToList(T[] c) {
		return Arrays.asList(c);
	}

	public static <T, G> List<T> fromArratToList(T[] c, G[] x) {
		for (G elemento : x) {
			System.out.println(elemento);
		}

		return Arrays.asList(c);
	}

}
