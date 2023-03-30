object Video13{
	/*def main(args: Array[String]): Unit = {
		println("-"*50)

		code(args)

		println("-"*50)

	}*/

	def code(args: Array[String]): Unit = {
		
		//type BankAccount = Symbol => Any
		//def BankAccount(initialBalance: Int): BankAccount = {
		class BankAccount(initialBalance: Int)				  {
			private[this] var balance: Int = initialBalance
			// val withdraw: Int => Unit = amount =>
			def withdraw(amount: Int): Unit =
				if(balance >= amount)
					balance = balance - amount
				else
					sys.error("Insufficient Funds!!")

			// val deposit: Int => Unit = amount =>
			def deposit(amount: Int): Unit =
				if(amount >= 1) 
					balance = balance + amount
				else
					sys.error("It's only possible to deposit positive amounts")

			// val getBalance: () => Int = () =>
			// 	balance

			def getBalance: Int =
				balance

			// def dispatch: BankAccount = operation =>
			// val dispatch: Symbol => Any = operation =>
			// 	if(operation == 'withdraw)
			// 		withdraw
			// 	else if (operation == 'deposit)
			// 		deposit
			// 	else if (operation == 'getBalance)
			// 		getBalance
			// 	else
			// 		sys.error(s"Unknown operation: $operation")


			//dispatch
		}

		// val bankAccount1 = BankAccount(initialBalance = 100)
		// val withdraw1 = bankAccount1('withdraw).asInstanceOf[Int => Unit]
		// val deposit1 = bankAccount1('deposit).asInstanceOf[Int => Unit]
		// val getBalance1 = bankAccount1('getBalance).asInstanceOf[() => Int]

		val bankAccount1 = new BankAccount(initialBalance = 100)
		// val withdraw1 = bankAccount1.withdraw
		// val deposit1 = bankAccount1.deposit
		// val getBalance1 = bankAccount1.getBalance

		bankAccount1.withdraw(10)
		println(bankAccount1.getBalance)
		
		bankAccount1.withdraw(15)
		println(bankAccount1.getBalance)

		println()

		bankAccount1.deposit(45)
		println(bankAccount1.getBalance)

		println()

		//println(bankAccount1('bla)(45))

		def makeTransfer(from: BankAccount, amount: Int, to: BankAccount): Unit = {
			def getBalance(account: BankAccount): Int =
				// account('getBalance).asInstanceOf[() => Int]()
				account.getBalance


			def showBothAccounts(): Unit = {
				// println(s"from: ${getBalance(from)}")
				// println(s"to: ${getBalance(to)}")

				println(s"from: ${from.getBalance}")
				println(s"to: ${to.getBalance}")
			}

			println("Before")
			showBothAccounts()

			// from('withdraw).asInstanceOf[Int => Unit](amount)
			// to('deposit).asInstanceOf[Int => Unit](amount)

			from.withdraw(amount)
			to.deposit(amount)


			println()

			println("After")
			showBothAccounts()

			println(s"amount: $amount")
		}

		// val alanAccount:  BankAccount = BankAccount(initialBalance = 100)
		// val erickAccount: BankAccount = BankAccount(initialBalance =  20)

		val alanAccount:  BankAccount = new BankAccount(initialBalance = 100)
		val erickAccount: BankAccount = new BankAccount(initialBalance =  20)

		makeTransfer(
			from = alanAccount,
			amount = 30,
			to = erickAccount
		) 

	}

}
