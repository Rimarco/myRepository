package redis;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = {3,1,5,7,2,4,9,6};
        new InsertSort().insertSort(a);
        System.out.println(Arrays.toString(a));
    	
        
    }
    /**
     * ֱ�Ӳ��������㷨��ʵ��
     * @param a
     */
    private void insertSort(int[] a) {
        // TODO Auto-generated method stub
        System.out.println("��������������������������������������ֱ�Ӳ��������㷨������������������������������������������");
        int n = a.length;
        int i,j;
        for(i=1;i<n;i++){
            int temp = a[i];
            for(j=i-1;j>=0 && a[j]>temp;j--){
                a[j+1] = a[j];       
            }
            a[j+1] = temp;
            System.out.println("j+1:"+(j+1));
            
          //  print(a,n,i);
        }
        //printResult(a,n);
    }
    /**
     * ��ӡ��������ս��
     * @param a
     * @param n
     */
   /* private void printResult(int[] a, int n){
        System.out.print("������������");
        for(int j=0;j<n;j++){
            System.out.print(" "+a[j]);
        }
        System.out.println();
    }
    *//**
     * ��ӡ�����ÿ��ѭ���Ľ��
     * @param a
     * @param n
     * @param i
     *//*
    private void print(int[] a, int n, int i) {
        // TODO Auto-generated method stub
        System.out.print("��"+i+"�Σ�");
        for(int j=0;j<n;j++){
            System.out.print(" "+a[j]);
        }
        System.out.println();
    }*/
}