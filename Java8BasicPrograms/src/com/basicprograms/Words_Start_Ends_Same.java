package com.basicprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words_Start_Ends_Same {
public static void main(String[] args) {
	List<String> word=Arrays.asList("sd","ada","vfv","abc","hfg","krk","vv");
	word.stream().filter(x->x.endsWith(String.valueOf(x.charAt(0)))).forEach(x->System.out.println(x));
}
}
