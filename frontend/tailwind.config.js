module.exports = {
  purge: [
    './public/**/*.html',
    './src/**/*.vue',
    './src/**/*.css',
    './src/**/*.js',
  ],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      colors: {
        'old-school-cream': '#E0CC8D',
        'old-school-maroon': '#8F0F10'
      }
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
