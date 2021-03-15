package org.example;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Rule;
import org.junit.Test;

import org.example.projects.CoreModule;
import org.example.fixture.ContainerRule;

import com.amazonaws.services.ec2.AmazonEC2;

public class SanityTest {
	@Rule
	public ContainerRule containerRule = new ContainerRule(new CoreModule());
	
	@Inject
	AmazonEC2 amazonEC2;

	@Test
	public void sanityCheckTest() {
		assertNotNull(amazonEC2);
	}

}
