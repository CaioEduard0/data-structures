package com;

import java.math.BigDecimal;

public class TesteContasSGF {

    public static void main(String[] args) {

        boolean nominal = false;
        boolean percentual = true;

        BigDecimal valorAprovado = new BigDecimal(100000);
        BigDecimal valorPcAprovada = new BigDecimal(90000);
        BigDecimal valorRepassado = new BigDecimal(70000);
        BigDecimal valorRepassar = new BigDecimal(100000);
        BigDecimal porcentagemFinanciamento = new BigDecimal(50);
        BigDecimal parcelaAjuste = new BigDecimal(0);

        if (nominal) {

            parcelaAjuste = valorPcAprovada.subtract(valorRepassado);

            //parcelaAjuste = valorAprovado.subtract(valorAprovado.subtract((valorPcAprovada.subtract(valorRepassado))));

        } else if (percentual) {

            if (valorPcAprovada.compareTo(valorAprovado) == -1) {

                valorAprovado = new BigDecimal(200000);
                valorPcAprovada = new BigDecimal(80000);
                valorRepassado = new BigDecimal(70000);
                porcentagemFinanciamento = new BigDecimal(50);
                // parcelaAjuste = new BigDecimal(0);
                parcelaAjuste = valorPcAprovada.multiply(new BigDecimal("0." + porcentagemFinanciamento));

            } else {

                valorAprovado = new BigDecimal(200000);
                valorPcAprovada = new BigDecimal(300000);
                //valorRepassado = new BigDecimal(200000);
                porcentagemFinanciamento = new BigDecimal(50);
                // parcelaAjuste = new BigDecimal(0);
                parcelaAjuste = valorPcAprovada.subtract(valorAprovado);


            }



        }

        System.out.println(parcelaAjuste);
    }
}
