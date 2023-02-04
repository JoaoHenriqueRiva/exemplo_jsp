package br.edu.unoesc.exemplo_web;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
	private String nome;
	private Integer quantidade;
	private BigDecimal valor;
}
