class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize();
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android");
                }
            }
        }
    }
}