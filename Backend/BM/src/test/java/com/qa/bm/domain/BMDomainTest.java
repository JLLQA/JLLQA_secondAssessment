package com.qa.bm.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

@SpringBootTest
public class BMDomainTest {

	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(BM.class)
		.suppress(Warning.ALL_FIELDS_SHOULD_BE_USED)
		.verify();
	}

}
