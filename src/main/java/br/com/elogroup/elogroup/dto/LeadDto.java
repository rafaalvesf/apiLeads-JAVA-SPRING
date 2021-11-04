package br.com.elogroup.elogroup.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class LeadDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @Email
    @NotBlank
    private String email;
}
