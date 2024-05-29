package test.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.PachetTuristicTest;
import test.PersoanaTests;
import test.categorii.TesteEroare;
import test.categorii.TesteRange;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTests.class})
@Categories.IncludeCategory(TesteEroare.class)
@Categories.ExcludeCategory(TesteRange.class)
public class SuitaCustom {
}
