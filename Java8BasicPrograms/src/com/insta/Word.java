package com.insta;

import java.util.Arrays;
import java.util.List;

public class Word {
public static void main(String[] args) {
	List<String> s=Arrays.asList("as","axs","ada","krk");
	s.stream().map(x->x.endsWith(String.valueOf(x.charAt(0)))).forEach(x->System.out.println(x));
}
}
