public class Queue {

        private int[] data;
        private int front, tail;

        public void MyCircularQueue(int k) {
            data = new int[k + 1];
            front = 0;
            tail = 0;
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            } else {
                data[tail] = value;
                tail = (tail + 1) % data.length;
                return true;
            }
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            } else {
                front = (front + 1) % data.length;
                return true;
            }
        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return data[front];
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            return data[(tail - 1 + data.length) % data.length];
        }

        public boolean isEmpty() {
            return front == tail;
        }

        public boolean isFull() {
            return (tail + 1) % data.length == front;
        }
    }


