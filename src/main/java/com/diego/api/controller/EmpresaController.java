package com.diego.api.controller;

import com.diego.api.dto.EmpresaDTO;
import com.diego.api.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

//    @PostMapping
//    public ResponseEntity<EmpresaDTO> cadastrar(@RequestBody EmpresaDTO empresaDTO){
//        empresaDTO.setId(1L);
//        return ResponseEntity.ok(empresaDTO);
//    }

    @PostMapping
    public ResponseEntity<Response<EmpresaDTO>> cadastrar(@RequestBody EmpresaDTO empresaDTO){
        Response<EmpresaDTO> response = new Response<>();

        empresaDTO.setId(1L);
        response.setResultado(empresaDTO);
        return ResponseEntity.ok(response);
    }

}
