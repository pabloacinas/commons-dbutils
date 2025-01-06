import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.sql.ResultSet resultSet0 = null;
        org.apache.commons.dbutils.ResultSetIterator resultSetIterator1 = new org.apache.commons.dbutils.ResultSetIterator(resultSet0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = resultSetIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.isLast()\" because \"this.resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.sql.ResultSet resultSet0 = null;
        org.apache.commons.dbutils.ResultSetIterator resultSetIterator1 = new org.apache.commons.dbutils.ResultSetIterator(resultSet0);
        java.lang.Class<?> wildcardClass2 = resultSetIterator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.sql.ResultSet resultSet0 = null;
        java.lang.Iterable<java.lang.Object[]> objArrayIterable1 = org.apache.commons.dbutils.ResultSetIterator.iterable(resultSet0);
        java.lang.Class<?> wildcardClass2 = objArrayIterable1.getClass();
        org.junit.Assert.assertNotNull(objArrayIterable1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.sql.ResultSet resultSet0 = null;
        org.apache.commons.dbutils.RowProcessor rowProcessor1 = null;
        org.apache.commons.dbutils.ResultSetIterator resultSetIterator2 = new org.apache.commons.dbutils.ResultSetIterator(resultSet0, rowProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = resultSetIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.next()\" because \"this.resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.sql.ResultSet resultSet0 = null;
        org.apache.commons.dbutils.RowProcessor rowProcessor1 = null;
        org.apache.commons.dbutils.ResultSetIterator resultSetIterator2 = new org.apache.commons.dbutils.ResultSetIterator(resultSet0, rowProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            resultSetIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.deleteRow()\" because \"this.resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.sql.ResultSet resultSet0 = null;
        org.apache.commons.dbutils.ResultSetIterator resultSetIterator1 = new org.apache.commons.dbutils.ResultSetIterator(resultSet0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray2 = resultSetIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.next()\" because \"this.resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.sql.ResultSet resultSet0 = null;
        org.apache.commons.dbutils.ResultSetIterator resultSetIterator1 = new org.apache.commons.dbutils.ResultSetIterator(resultSet0);
        // The following exception was thrown during execution in test generation
        try {
            resultSetIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.deleteRow()\" because \"this.resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.sql.ResultSet resultSet0 = null;
        org.apache.commons.dbutils.RowProcessor rowProcessor1 = null;
        org.apache.commons.dbutils.ResultSetIterator resultSetIterator2 = new org.apache.commons.dbutils.ResultSetIterator(resultSet0, rowProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = resultSetIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.isLast()\" because \"this.resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.sql.ResultSet resultSet0 = null;
        org.apache.commons.dbutils.RowProcessor rowProcessor1 = null;
        org.apache.commons.dbutils.ResultSetIterator resultSetIterator2 = new org.apache.commons.dbutils.ResultSetIterator(resultSet0, rowProcessor1);
        java.lang.Class<?> wildcardClass3 = resultSetIterator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

