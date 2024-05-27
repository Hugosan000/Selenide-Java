package br.com.rocketskills.petlov;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;





class PontoDoacao {
	String nome;
	String email;
	String cep;
	Integer numero;
	String detalhes;
	String[] pets;

	public PontoDoacao(String nome, String email, String cep, Integer numero, String detalhes, String[] pets) {
		this.nome = nome;
		this.email = email;
		this.cep = cep;
		this.numero = numero;
		this.detalhes = detalhes;
		this.pets = pets;
	}
}

public class Cadastro {

	private void submeteFormulario(PontoDoacao ponto) {
		$("input[placeholder='Nome do ponto de doação']").setValue(ponto.nome);
		$("input[name=email]").setValue(ponto.email);
		$("input[name=cep]").setValue(ponto.cep);
		$("input[value='Buscar CEP']").click();
		$("input[name=addressNumber]").setValue(ponto.numero.toString());
		$("input[name=addressDetails]").setValue(ponto.detalhes);
		$(By.xpath("//span[text()=\"Cachorros\"]/..")).click();
		$(".button-register").click();
	}

	@Test
	@DisplayName("Should be possible to create a point of donation")
	public void happyPath() {
		PontoDoacao ponto = new PontoDoacao(
				"Pet Point",
				"emailtest@gmail.com",
				"04534011",
				1000,
				"in front of the park",
				new String[]{"Cachorros", "Gatos"}
		);

		open("https://petlov.vercel.app/signup");
		$("h1").shouldHave(text("Cadastro de ponto de doação"));
		submeteFormulario(ponto);

		String target = "Seu ponto de doação foi adicionado com sucesso. Juntos, podemos criar um mundo onde todos os animais recebam o amor e cuidado que merecem.";
		$("#success-page p").shouldHave(text(target));
	}

	@Test
	@DisplayName("Should not possible to create a point with wrong email")
	public void wrongEmail() {
		PontoDoacao ponto = new PontoDoacao(
				"Dog Point",
				"service&gmail.com",
				"04534011",
				1000,
				"in front of the park",
				new String[]{"Cachorros", "Gatos"}
		);

		open("https://petlov.vercel.app/signup");
		$("h1").shouldHave(text("Cadastro de ponto de doação"));
		submeteFormulario(ponto);

		String target = "Informe um email válido";
		$(".alert-error").shouldHave(text(target));
	}
}
