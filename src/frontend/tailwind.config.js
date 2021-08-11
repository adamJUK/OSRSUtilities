module.exports = {
  purge: [
    "./public/**/*.html",
    "./src/**/*.vue",
    "./src/**/*.css",
  ],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      colors: {
        "OSRS-maroon": "#890A0B",
        "OSRS-cream": "#F1DE9A",
      },
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
