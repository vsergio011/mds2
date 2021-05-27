import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

class VistaCabecerapagina extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 10%; padding: var(--lumo-space-m); justify-content: flex-start;" theme="spacing" id="vaadinHorizontalLayout">
 <img src="https://image.freepik.com/free-vector/online-shopping-logo-design-template_130382-9.jpg" style="width: 70px; height: 70px; flex-grow: 0; flex-shrink: 0; align-self: center;">
 <vaadin-horizontal-layout theme="spacing" style="justify-content: center; width: 100%;">
  <vaadin-combo-box id="categoriesCombo" allow-custom-value></vaadin-combo-box>
  <vaadin-button id="offerBtn">
    Categorias 
  </vaadin-button>
  <vaadin-button id="limpiarBtn">
    Inicio 
  </vaadin-button>
  <vaadin-button id="offertasButton">
   Ofertas
  </vaadin-button>
  <vaadin-text-field placeholder="Search" style="width: 45%;" id="searchInput">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button id="btnLogin">
    Login 
  </vaadin-button>
  <vaadin-button id="btnCarrito">
    Carrito 
  </vaadin-button>
  <vaadin-button id="perfilBtn">
    Perfil 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-button id="adminBtn">
   Admin 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-cabecerapagina';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCabecerapagina.is, VistaCabecerapagina);
