import org.junit.Test;
import org.junit.Assert;

public class QueueTests<T> {
    @Test
    public void testConstructor1() {
        Assert.assertEquals("[]\n",new Queue<Integer>().toString());
    }

    @Test
    public void testEnqueue() {
        Queue<Integer> q=new Queue<>();
        q.enqueue(1);
        Assert.assertEquals("[\n1\n]\n",q.toString());
    }

    @Test
    public void testDequeue() {
        Queue<Integer> q=new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.dequeue();
        Assert.assertEquals("[\n2\n]\n",q.toString());
    }

    @Test
    public void testPeek() {
        Queue<Integer> q=new Queue<>();
        q.enqueue(2);
        Assert.assertEquals(2,(int)q.peek());
    }

    @Test
    public void isEmpty() {
        Queue<Integer> q=new Queue<>();
        Assert.assertEquals("[]\n",q.toString());
    }
}