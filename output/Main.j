.class public Main
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
.method public <init>()V
.limit stack 128
.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		new Order
		dup
		invokespecial Order/<init>()V
		aload_1
		
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		
		
		putfield Order/quantity Ljava/lang/Integer;
		aload_1
		getfield Order/quantity Ljava/lang/Integer;
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_1
		getfield Order/quantity Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		return
.end method
.method public createOrder(LProductCatalog;Ljava/lang/Integer;)LOrder;
.limit stack 128
.limit locals 128
		new Order
		dup
		invokespecial Order/<init>()V
		astore_3
		aload_3
		areturn
.end method
.method public getSum(LList;)Ljava/lang/Integer;
.limit stack 128
.limit locals 128
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_2
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_3
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 4
		aload_3
		areturn
.end method
