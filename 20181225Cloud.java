public static void {
int[] a= {3,36,8,-9,3};
		  for(int m=0;m<a.length;m++){
			  int index=m;
			  int min=a[m];
		     {for(int n=m+1;n<a.length;n++)
		        {if(a[n]<min)
		           {min=a[n];
		           index=n;
                   }
		        }
		      int temp=a[m];
		      a[m]=a[index];
		      a[index]=temp;
		     } 
	         }
		  for(int l=0;l<a.length;l++) {
			  System.out.print(a[l]);
		  }
      }
