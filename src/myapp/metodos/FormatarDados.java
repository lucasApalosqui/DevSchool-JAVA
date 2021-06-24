package myapp.metodos;

public class FormatarDados {
	public static String formataCpfCnpj(Long cpfCnpj) {
		String myCpf = cpfCnpj.toString();
		if ((myCpf.matches("\\d{11}") | myCpf.matches("\\d{14}"))) {
			if(myCpf.length() == 11) {
				String cpfFormat = myCpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
				return cpfFormat;
			}
			
			else {
				String cnpjFormat = myCpf.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
				return cnpjFormat;
			}
		}
		else {
			String msgError = ("Erro CPF ou CNPJ, Por favor verifique os dados cadastrados");
			return msgError;
		}
	}
	
	public static String formataIeIm(Long ieIm) {
		String ieim = ieIm.toString();
		if ((ieim.length() == 9)) {
			String ie = ieIm.toString();
			String ie1 = ie.substring(0,3);
			String ie2 = ie.substring(3,6);
			String ie3 = ie.substring(6,9);
			String ieImAtt = String.format("%s.%s.%s", ie1,ie2,ie3);
			return ieImAtt;
		}
		else {
			String im = ieIm.toString();
			String im1 = im.substring(0,2);
			String im2 = im.substring(2,5);
			String im3 = im.substring(5,8);
			String ieImAtt = String.format("%s.%s.%s", im1,im2,im3);
			return ieImAtt;
		}
		
	}
}
