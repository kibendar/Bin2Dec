import { HomePage } from "@/pages";
import MainLayout from "./layouts/MainLayout/MainLayout";
import { QueryClientProvider } from "@tanstack/react-query";
import { queryClient } from "@/shared/api/queryClient";

function App() {
  return (
    <>
      <QueryClientProvider client={queryClient}>
        <MainLayout>
          <HomePage />
        </MainLayout>
      </QueryClientProvider>
    </>
  );
}

export default App;
