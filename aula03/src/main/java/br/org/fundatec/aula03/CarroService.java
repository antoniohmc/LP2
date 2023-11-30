package br.org.fundatec.aula03;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {


    private final CarroRepositorySpring carroRepository;

    public CarroService(CarroRepositorySpring carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listAllCarros() {
        return carroRepository.findAll();
    }

    public void saveCarro(Carro carro) {
        carroRepository.save(carro);
    }

    public void deleteCarro(String placa) {
        carroRepository.deleteById(placa);

    }


    public void editCarro(String codigoPlaca, Carro carro) {
        carroRepository.findById(codigoPlaca)
                .orElseThrow(() -> new RuntimeException("Carro com placa: " + codigoPlaca + "   nao existe"));
        carro.setPlaca(codigoPlaca);
        carroRepository.save(carro);

    }


}
