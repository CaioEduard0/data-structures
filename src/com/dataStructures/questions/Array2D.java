package com.dataStructures.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2D {
	
	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int maior = 0;
        int q = 0;
        int[][] k = new int[3][3];
        for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 4; j++) {
        		if (q > 0) {
        			q = j;
        		}
        		int sum = 0;
        		for (int x = j; x < j + 3; x++) {
        			for (int y = q; y < j + 3; y++) {
        				sum += arr.get(x).get(y);
        			}
        			q++;
        		}
        		if (sum > maior) {
        			maior = sum;
        		}
//        		for (int x = 0; x < 3; x++) {
//        			int sum = 0;
//            		k[j][x] = arr.get(j).get(x);
//            		sum += k[j][x];
//        		}
        	}
        }
        System.out.println(maior);
        
        bufferedReader.close();
    }
}
